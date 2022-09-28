package ru.mirea.pr10.complex;

public interface ComplexAbstractFactory {
    public Complex createComplex();

    public Complex createComplex(int real, int image);
}
