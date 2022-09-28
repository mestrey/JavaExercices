package ru.mirea.pr9.student.exceptions;

public class EmptyStringException extends RuntimeException {
    public EmptyStringException(String errorMessage, Throwable e) {
        super(errorMessage, e);
    }
}