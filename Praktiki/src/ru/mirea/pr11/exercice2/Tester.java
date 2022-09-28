package ru.mirea.pr11.exercice2;

public class Tester {
    public static void main(String[] args) {
        ArrayQueue arrQueue = new ArrayQueue();
        for (int i = 0; i < 5; i++)
            arrQueue.enqueue(i);

        System.out.println(arrQueue.element() + " ");

        while (!arrQueue.isEmpty())
            System.out.print(arrQueue.dequeue() + " ");

        LinkedQueue linkedQueue = new LinkedQueue();

        for (int i = 0; i < 5; i++)
            linkedQueue.enqueue(i);

        System.out.println("\n\n" + linkedQueue.element() + " ");

        while (!linkedQueue.isEmpty())
            System.out.print(linkedQueue.dequeue() + " ");
        System.out.println();
    }
}
