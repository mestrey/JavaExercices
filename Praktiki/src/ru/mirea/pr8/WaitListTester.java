package ru.mirea.pr8;

public class WaitListTester {
    public static void main(String[] args) {
        BoundedWaitList<Person> boundedWaitList = new BoundedWaitList<Person>(5);

        for (int i = 0; i < 5; i++)
            boundedWaitList.add(new Person("Person n_" + i));

        System.out.println("The capacity is: " + boundedWaitList.getCapacity());
        System.out.println(boundedWaitList);

        if (boundedWaitList.contains(boundedWaitList.content.peek()))
            System.out.println("boundedWaitList contains " + boundedWaitList.content.peek().toString());

        boundedWaitList.remove();
        System.out.println(boundedWaitList);
        boundedWaitList.add(new Person("Person n_6"));
        System.out.println(boundedWaitList);

        UnfairWaitList<Person> unfairWaitList = new UnfairWaitList<Person>();

        for (int i = 0; i < 5; ++i)
            unfairWaitList.add(new Person("Unfair Person n_" + (i + 1)));

        System.out.println(unfairWaitList);

        unfairWaitList.remove(new Person("Unfair Person n_1"));
        unfairWaitList.remove(unfairWaitList.content.peek());
        System.out.println(unfairWaitList);

        unfairWaitList.moveToBack(unfairWaitList.content.peek());
        System.out.println(unfairWaitList);
    }
}
