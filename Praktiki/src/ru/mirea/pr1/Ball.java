package ru.mirea.pr1;

public class Ball {
    private String brand;
    private int size;

    public Ball(String name, int age) {
        this.brand = name;
        this.size = age;
    }

    public Ball(String name) {
        this.brand = name;
        this.size = 0;
    }

    public Ball() {
        brand = "Nike";
        size = 0;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String toString() {
        return brand + ", size " + size;
    }

    public void shoot() {
        System.out.println(brand + "'s ball has been shoot!");
    }
}
