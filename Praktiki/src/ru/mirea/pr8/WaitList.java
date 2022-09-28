package ru.mirea.pr8;

import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

public class WaitList<E> implements IWaitList<E> {
    protected ConcurrentLinkedQueue<E> content;

    public WaitList() {
        content = new ConcurrentLinkedQueue<E>();
    }

    public WaitList(Collection<E> c) {
        content = new ConcurrentLinkedQueue<E>();
        content.addAll(c);
    }

    /**
     * stringify class instance
     * 
     * @return string describing instance
     */
    @Override
    public String toString() {
        return "WaitList [content=" + content + "]";
    }

    /**
     * add element to linked queue
     * 
     * @param E element
     */
    @Override
    public void add(E element) {
        content.add(element);
    }

    /**
     * removes the head of the queue
     * 
     * @return removed element
     */
    @Override
    public E remove() {
        return content.poll();
    }

    /**
     * @param E element
     * @return true if the queue contains the element, else false
     */
    @Override
    public boolean contains(E element) {
        return content.contains(element);
    }

    /**
     * @param Collection<E> c
     * @return true if the queue contains the elements, else false
     */
    @Override
    public boolean containsAll(Collection<E> c) {
        return content.containsAll(c);
    }

    /**
     * @return true if the queue if empty, else false
     */
    @Override
    public boolean isEmpty() {
        return content.isEmpty();
    }
}
