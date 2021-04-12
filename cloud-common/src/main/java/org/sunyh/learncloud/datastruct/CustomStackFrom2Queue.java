package org.sunyh.learncloud.datastruct;

public class CustomStackFrom2Queue<T> {
    private CustomQueue<T> main;
    private CustomQueue<T> assist;

    private int length;

    public int getLength() {
        return length;
    }

    public void push(T t){
        if(main==null){
            main=new CustomQueue<>();
            assist=new CustomQueue<>();
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
        CustomStackFrom2Queue<String> stack2=new CustomStackFrom2Queue<>();
        StringBuilder stringBuilder=new StringBuilder();
        stack2.push("1");
        stack2.push("2");
        stack2.push("3");
        stack2.push("4");

        stringBuilder.append(stack2.pop());
        stringBuilder.append(stack2.pop());
        stringBuilder.append(stack2.pop());

        stack2.push("5");
        stack2.push("6");
        stack2.push("7");

        while (stack2.length>0){
            stringBuilder.append(stack2.pop());
        }

        System.out.println(stringBuilder.toString());
    }
}
