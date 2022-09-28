package ru.mirea.pr16.utils;

public class QueueNode<T> {
    private QueueNode<T> next;
    private QueueNode<T> prev;
    private T value;

    public QueueNode(QueueNode<T> next, QueueNode<T> prev, T value) {
        this.next = next;
        this.prev = prev;
        this.value = value;
    }

    public QueueNode<T> getNext() {
        return next;
    }

    public void setNext(QueueNode<T> next) {
        this.next = next;
    }

    public QueueNode<T> getPrev() {
        return prev;
    }

    public void setPrev(QueueNode<T> prev) {
        this.prev = prev;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}