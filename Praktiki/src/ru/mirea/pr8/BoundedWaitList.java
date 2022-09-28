package ru.mirea.pr8;

public class BoundedWaitList<E> extends WaitList<E> {
    private int capacity;
    private int filled;

    public BoundedWaitList(int capacity) {
        super();
        this.capacity = capacity;
        this.filled = 0;
    }

    /**
     * @return int (capacity)
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * add element if possible
     */
    public void add(E element) {
        if (filled < capacity) {
            super.add(element);
            filled++;
        }
    }

    /**
     * @return removed element
     */
    @Override
    public E remove() {
        filled--;
        return super.remove();
    }

    /**
     * @return string describing instance
     */
    @Override
    public String toString() {
        return "BoundedWaitList [capacity=" + capacity + ", filled=" + filled + "]";
    }
}
