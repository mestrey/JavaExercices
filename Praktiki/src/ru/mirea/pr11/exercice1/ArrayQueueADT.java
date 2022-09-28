package ru.mirea.pr11.exercice1;

public class ArrayQueueADT {
    private int size;
    private int head;
    private int tail;
    private Object[] elements;

    public ArrayQueueADT(int size) {
        elements = new Object[10];
    }

    static void capacity(ArrayQueueADT queue, int cap) {
        assert queue != null;
        int len = queue.elements.length;

        if (cap > len) {
            Object[] newElements = new Object[queue.elements.length * 2];

            int i = 0;
            while (queue.tail != queue.head) {
                newElements[i] = queue.elements[queue.head];
                queue.head = (queue.head + 1) % len;
                i++;
            }

            queue.head = 0;
            queue.tail = len - 1;
            queue.elements = newElements;
        }
    }

    /**
     * pre: element != null
     * queue != null
     *
     * pst: elements[tail] = element
     * tail = (tail + 1) % elements.length
     * size = size + 1
     */
    public static void enqueue(ArrayQueueADT queue, Object element) {
        assert queue != null;
        assert element != null;

        capacity(queue, queue.size + 2);

        queue.elements[queue.tail] = element;
        queue.tail = (queue.tail + 1) % queue.elements.length;
        queue.size++;
    }

    /**
     * pre: queue != null
     * size > 0
     * 
     * pst: @return elements[head]
     */
    public static Object element(ArrayQueueADT queue) {
        assert queue != null;
        assert queue.size > 0;
        return queue.elements[queue.head];
    }

    /**
     * pre: queue != null
     * size > 0
     * 
     * pst: @return elements[head]
     * head = (head + 1) % elements.length
     * size = size - 1
     */
    public static Object dequeue(ArrayQueueADT queue) {
        assert queue != null;

        Object ret = element(queue);
        queue.elements[queue.head] = null;
        queue.head = (queue.head + 1) % queue.elements.length;
        queue.size--;

        return ret;
    }

    /**
     * pre: queue != null
     * 
     * pst: @return size
     */
    public static int size(ArrayQueueADT queue) {
        assert queue != null;
        return queue.size;
    }

    /**
     * pre: queue != null
     * 
     * pst: @return (size == 0)
     */
    public static boolean isEmpty(ArrayQueueADT queue) {
        assert queue != null;
        return (queue.size == 0);
    }

    /**
     * pre: queue != null
     * 
     * pst: size = 0
     * head = 0
     * tail = 0
     */
    public static void clear(ArrayQueueADT queue) {
        assert queue != null;
        queue.head = 0;
        queue.tail = 0;
        queue.size = 0;
    }
}
