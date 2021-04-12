package org.sunyh.learncloud.datastruct;

public class CustomQueueFrom2Stack<T> {
    private CustomStack<T> main;
    private CustomStack<T> assist;
    private int length;
    public int getLength(){
        return this.length;
    }

    public void push(T t){
        if ( main==null ){
            main=new CustomStack<>();
            assist=new CustomStack<>();
        }
        main.push(t);
        length++;
    }

    public T pop(){
        if(main!=null){
            while (main.getLength()>1){
                assist.push(main.pop());
            }
            T pop = main.pop();
            while (assist.getLength()>0){
                main.push(assist.pop());
            }
            length--;
            return pop;
        }
        return null;
    }

    public static void main(String[] args) {
        CustomQueueFrom2Stack<String> queue2=new CustomQueueFrom2Stack<>();
        StringBuilder stringBuilder=new StringBuilder();
        queue2.push("1");
        queue2.push("2");
        queue2.push("3");
        queue2.push("4");

        stringBuilder.append(queue2.pop());
        stringBuilder.append(queue2.pop());
        stringBuilder.append(queue2.pop());

        queue2.push("5");
        queue2.push("6");
        queue2.push("7");

        while (queue2.length>0){
            stringBuilder.append(queue2.pop());
        }

        System.out.println(stringBuilder.toString());
    }
}
