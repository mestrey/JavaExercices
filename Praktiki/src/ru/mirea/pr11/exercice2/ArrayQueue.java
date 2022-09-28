package ru.mirea.pr11.exercice2;

public class ArrayQueue extends AbstractQueue {
    private int head = 0;
    private Object[] elements = new Object[5];

    protected void enqueueImplementation(Object element) {
        ensureCapacity(size + 1);
        elements[(head + size) % elements.length] = element;
    }

    private void ensureCapacity(int capacity) {
        if (capacity <= elements.length)
            return;

        Object[] newElements = new Object[2 * capacity];

        if (head == 0) {
            for (int i = 0; i < size; i++)
                newElements[i] = elements[i];
            elements = newElements;
        } else {
            for (int i = head; i < elements.length; i++)
                newElements[i - head] = elements[i];
            for (int i = 0; i <= (head + size) % elements.length; i++)
                newElements[i + elements.length - head] = elements[i];

            head = 0;
            elements = newElements;
        }
    }

    protected void remove() {
        head = (head + 1) % elements.length;
    }

    protected Object elementImplementation() {
        return elements[head];
    }

    protected void clearImplementation() {
        elements = new Object[5];
        head = 0;
    }
}
