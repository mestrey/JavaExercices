package ru.mirea.pr11.exercice2;

public interface Queue {
    /**
     * pre: element != null
     * pst: n = n' + 1 && i = 1..n' : a[i]' = a[i] && a[n] = element
     * 
     * @param element
     */
    public void enqueue(Object element);

    /**
     * pre: n > 0
     * pst: @return a[1] && n = n' − 1 && i=2..n : a[i]' = a[i]
     */
    public Object dequeue();

    /**
     * pre: n > 0
     * pst: @return a[1] && n = n' && i=1..n : a[i]' = a[i]
     */
    public Object element();

    /**
     * pst: @return n > 0 && n = n' && i=1..n : a[i]' = a[i]
     */
    public boolean isEmpty();

    /**
     * pst: n = 0 && i = 0..elements.length - 1 : a[i]' = null
     */
    public void clear();
}
