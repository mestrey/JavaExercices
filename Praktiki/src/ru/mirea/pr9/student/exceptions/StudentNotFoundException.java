package ru.mirea.pr9.student.exceptions;

public class StudentNotFoundException extends RuntimeException {
    public StudentNotFoundException(String message, Throwable e) {
        super(message, e);
    }
}
