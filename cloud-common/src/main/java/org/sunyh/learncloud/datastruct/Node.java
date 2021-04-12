package org.sunyh.learncloud.datastruct;

public class Node<T> {
    private T value;
    private Node<T> nexValue;
    Node(T value) {
        this.value = value;
    }

    public Node<T> getNexValue() {
        return nexValue;
    }

    public void setNexValue(Node<T> nexValue) {
        this.nexValue = nexValue;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
