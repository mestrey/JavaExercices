package ru.mirea.pr11.exercice2;

public abstract class AbstractQueue implements Queue {
    protected int size;

    public void enqueue(Object element) {
        assert element != null;
        enqueueImplementation(element);
        size++;
    }

    protected abstract void enqueueImplementation(Object element);

    public Object dequeue() {
        assert size > 0;

        Object result = element();
        size--;
        remove();

        return result;
    }

    protected abstract void remove();

    public Object element() {
        assert size > 0;
        return elementImplementation();
    }

    protected abstract Object elementImplementation();

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        clearImplementation();
        size = 0;
    }

    protected abstract void clearImplementation();
}
