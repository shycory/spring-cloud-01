package org.sunyh.learncloud.datastruct;


public class CustomStack<T> {
    private int length=0;

    public int getLength() {
        return length;
    }

    private Node<T> header = new Node<>(null);

    public void push(T t){
        Node<T> thisNode=new Node<T>(t);

        thisNode.setNexValue(header.getNexValue());
        header.setNexValue(thisNode);
        this.length+=1;
    }

    public T pop(){
        Node<T> popNode = header.getNexValue();
        header.setNexValue(popNode.getNexValue());
        this.length-=1;
        return popNode.getValue();
    }

    public static void main(String[] args) {
        CustomStack<String> stack=new CustomStack<>();
        StringBuilder stringBuilder=new StringBuilder();
        stack.push("1");
        stack.push("2");
        stack.push("3");
        stack.push("4");

        stringBuilder.append(stack.pop());
        stringBuilder.append(stack.pop());
        stringBuilder.append(stack.pop());

        stack.push("5");
        stack.push("6");
        stack.push("7");

        while (stack.length>0){
            stringBuilder.append(stack.pop());
        }

        System.out.println(stringBuilder.toString());
    }
}
