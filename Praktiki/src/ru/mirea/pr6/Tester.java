package ru.mirea.pr6;

import java.util.Random;

public class Tester {
    private static void displayArray(Student[] arr) {
        System.out.println("—".repeat(10));
        for (Student student : arr)
            System.out.println(student.toString());
        System.out.println("—".repeat(10));
    }

    public static void main(String[] args) {
        Student[] arr = new Student[10];
        Random rand = new Random();

        for (int i = 0; i < arr.length; i++) {
            int id = rand.nextInt(99);
            int gpa = rand.nextInt(99);
            arr[i] = new Student(id, "Student " + id, gpa);
        }

        displayArray(arr);
        (new SortingStudentsByID()).sort(arr);
        displayArray(arr);

        System.out.println();

        (new SortingStudentsByGPA()).sort(arr, 0, arr.length - 1);
        displayArray(arr);
    }
}
