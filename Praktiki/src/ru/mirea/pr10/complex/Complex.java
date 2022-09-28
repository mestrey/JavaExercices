package ru.mirea.pr10.complex;

public class Complex {
    private int real;
    private int image;

    public Complex() {
        real = 0;
        image = 0;
    }

    public Complex(int real, int image) {
        this.real = real;
        this.image = image;
    }

    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Complex [image=" + image + ", real=" + real + "]";
    }
}
