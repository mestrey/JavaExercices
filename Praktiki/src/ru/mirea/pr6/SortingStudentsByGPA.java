package ru.mirea.pr6;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        if (s1.getGpa() < s2.getGpa())
            return -1;
        else if (s1.getGpa() > s2.getGpa())
            return 1;
        else
            return 0;
    }

    public Student[] sort(Student[] array, int left, int right) {
        int ll = left;
        int rr = right;

        if (rr > ll) {
            Student pivot = array[(ll + rr) / 2];
            while (ll <= rr) {
                while (ll < right && this.compare(array[ll], pivot) < 0)
                    ll += 1;

                while (rr > left && this.compare(array[rr], pivot) > 0)
                    rr -= 1;

                if (ll <= rr) {
                    Student t = array[ll];
                    array[ll] = array[rr];
                    array[rr] = t;
                    ll += 1;
                    rr -= 1;
                }
            }

            if (left < rr)
                sort(array, left, rr);
            if (ll < right)
                sort(array, ll, right);
        }

        return array;
    }
}
