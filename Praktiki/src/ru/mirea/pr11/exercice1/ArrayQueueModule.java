package ru.mirea.pr11.exercice1;

public class ArrayQueueModule {
    private static int size;
    private static int head;
    private static int tail;
    private static Object[] elements = new Object[10];

    public static void capacity(int cap) {
        int len = elements.length;
        if (cap > len) {
            Object[] newElements = new Object[elements.length * 2];

            int i = 0;
            while (tail != head) {
                newElements[i] = elements[head];
                head = (head + 1) % len;
                i++;
            }

            head = 0;
            tail = len - 1;
            elements = newElements;
        }
    }

    /**
     * pre: element != null
     * 
     * pst: elements[tail] = element
     * tail = (tail + 1) % elements.length
     * size = size + 1
     */
    public static void enqueue(Object element) {
        assert element != null;

        capacity(size + 2);

        elements[tail] = element;
        tail = (tail + 1) % elements.length;
        size++;
    }

    /**
     * pre: size > 0
     * 
     * pst: @return elements[head]
     */
    public static Object element() {
        assert size > 0;
        return elements[head];
    }

    /**
     * pre: size > 0
     * 
     * pst: @return elements[head]
     * head = (head + 1) % elements.length
     * size = size - 1
     */
    public static Object dequeue() {
        Object ret = element();
        elements[head] = null;
        head = (head + 1) % elements.length;
        size--;
        return ret;
    }

    /**
     * pst: @return size
     */
    public static int size() {
        return size;
    }

    /**
     * pst: @return size == 0
     */
    public static boolean isEmpty() {
        return (size == 0);
    }

    /**
     * pst: size = 0
     * head = 0
     * tail = 0
     */
    public static void clear() {
        head = 0;
        tail = 0;
        size = 0;
    }
}
