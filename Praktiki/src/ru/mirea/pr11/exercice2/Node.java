package ru.mirea.pr11.exercice2;

public class Node {
    private Object value;
    private Node next;

    public Node(Object value, Node next) {
        assert value != null;
        this.value = value;
        this.next = next;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
