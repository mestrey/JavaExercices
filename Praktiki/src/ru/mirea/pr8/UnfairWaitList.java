package ru.mirea.pr8;

public class UnfairWaitList<E> extends WaitList<E> {
    public UnfairWaitList() {
        super();
    }

    /**
     * remove element if contained
     * 
     * @param E element
     */
    public void remove(E element) {
        if (content.contains(element))
            content.remove(element);
    }

    /**
     * move element to the back of the queue
     * 
     * @param E element
     */
    public void moveToBack(E element) {
        remove(element);
        content.add(element);
    }
}
