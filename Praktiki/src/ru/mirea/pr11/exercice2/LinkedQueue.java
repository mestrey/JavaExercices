package ru.mirea.pr11.exercice2;

public class LinkedQueue extends AbstractQueue {
    private Node head;
    private Node tail;

    protected void enqueueImplementation(Object element) {
        Node key = tail;
        tail = new Node(element, null);
        if (size == 0) {
            head = tail;
        } else {
            key.setNext(tail);
        }
    }

    protected void remove() {
        head = head.getNext();
    }

    protected Object elementImplementation() {
        return head.getValue();
    }

    protected void clearImplementation() {
    };
}
