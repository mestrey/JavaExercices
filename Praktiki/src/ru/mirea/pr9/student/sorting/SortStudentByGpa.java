package ru.mirea.pr9.student.sorting;

import java.util.Comparator;

import ru.mirea.pr9.student.Student;

public class SortStudentByGpa implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getGpa() < s2.getGpa() ? -1 : (s1.getGpa() > s2.getGpa() ? 1 : 0);
    }
}
