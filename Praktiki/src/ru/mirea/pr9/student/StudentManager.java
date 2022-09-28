package ru.mirea.pr9.student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.NoSuchElementException;

import ru.mirea.pr9.student.exceptions.EmptyStringException;
import ru.mirea.pr9.student.exceptions.StudentNotFoundException;

public class StudentManager {
    public static Student find(ArrayList<Student> array, String name) throws RuntimeException {
        if (name.equals(""))
            throw new EmptyStringException("An empty input was entered", new IllegalArgumentException());

        for (Student student : array)
            if (student.getName().equals(name))
                return student;

        throw new StudentNotFoundException("Such student is not found in the database", new NoSuchElementException());
    }

    public static ArrayList<Student> sort(ArrayList<Student> array, int left, int right,
            Comparator<Student> comparator) {
        int ll = left;
        int rr = right;

        if (rr > ll) {
            Student pivot = array.get((ll + rr) / 2);

            while (ll <= rr) {
                while (ll < right && comparator.compare(array.get(ll), pivot) < 0)
                    ll += 1;

                while (rr > left && comparator.compare(array.get(rr), pivot) > 0)
                    rr -= 1;

                if (ll <= rr) {
                    Collections.swap(array, ll, rr);
                    ll += 1;
                    rr -= 1;
                }
            }

            if (left < rr)
                sort(array, left, rr, comparator);
            if (ll < right)
                sort(array, ll, right, comparator);
        }

        return array;
    }
}
