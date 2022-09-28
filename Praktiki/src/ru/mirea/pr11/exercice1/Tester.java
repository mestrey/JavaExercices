package ru.mirea.pr11.exercice1;

public class Tester {
    public static void main(String[] args) {
        {
            ArrayQueueModule.capacity(10);
            for (int i = 0; i < 10; i++)
                ArrayQueueModule.enqueue(i);

            System.out.println("QueueModule size: " + ArrayQueueModule.size());
            System.out.println("Element: " + ArrayQueueModule.element());

            while (!ArrayQueueModule.isEmpty())
                System.out.print(ArrayQueueModule.dequeue() + " ");
            System.out.println();

            System.out.println("Size: " + ArrayQueueModule.size());
        }
        {
            ArrayQueue queue = new ArrayQueue(10);

            for (int i = 0; i < 10; i++)
                queue.enqueue(i);

            System.out.println("Queue size: " + queue.size());
            System.out.println("Element: " + queue.element());

            while (!queue.isEmpty())
                System.out.print(queue.dequeue() + " ");
            System.out.println();

            System.out.println("Size: " + queue.size());
        }
        {
            ArrayQueueADT queueADT = new ArrayQueueADT(10);

            ArrayQueueADT.capacity(queueADT, 10);
            for (int i = 0; i < 10; i++)
                ArrayQueueADT.enqueue(queueADT, i);

            System.out.println("QueueADT size: " + ArrayQueueADT.size(queueADT));
            System.out.println("Element: " + ArrayQueueADT.element(queueADT));

            while (!ArrayQueueADT.isEmpty(queueADT))
                System.out.print(ArrayQueueADT.dequeue(queueADT) + " ");
            System.out.println();

            System.out.println("Size: " + ArrayQueueADT.size(queueADT));
        }
    }
}
