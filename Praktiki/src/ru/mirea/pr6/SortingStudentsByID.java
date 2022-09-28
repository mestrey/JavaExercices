package ru.mirea.pr6;

public class SortingStudentsByID {
    public void sort(Student arr[]) {
        for (int j = 1; j < arr.length; j++) {
            Student current = arr[j];
            int i = j - 1;
            while ((i > -1) && (arr[i].getId() > current.getId())) {
                arr[i + 1] = arr[i];
                i--;
            }
            arr[i + 1] = current;
        }
    }
}
