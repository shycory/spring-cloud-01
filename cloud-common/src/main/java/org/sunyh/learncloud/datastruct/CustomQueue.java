package org.sunyh.learncloud.datastruct;

public class CustomQueue<T> {
    private Node<T> header;
    private Node<T> last;
    private int length;

    public int getLength() {
        return length;
    }

    public void push(T t){
        Node<T> newNode=new Node<>(t);
        if(header==null){
            header=last=newNode;
        }else {
            last.setNexValue(newNode);
            last=newNode;
        }
        length++;
    }

    public T pop(){
        T t=null;
        if(header!=null){
            t=header.getValue();
            header=header.getNexValue();
            length--;
        }
        if(header==null){
            last=null;
        }
        return t;
    }

    public static void main(String[] args) {
        CustomQueue<String> queue=new CustomQueue<>();
        StringBuilder stringBuilder=new StringBuilder();
        queue.push("1");
        queue.push("2");
        queue.push("3");
        queue.push("4");

        stringBuilder.append(queue.pop());
        stringBuilder.append(queue.pop());
        stringBuilder.append(queue.pop());

        queue.push("5");
        queue.push("6");
        queue.push("7");

        while (queue.length>0){
            stringBuilder.append(queue.pop());
        }

        System.out.println(stringBuilder.toString());
    }
}
