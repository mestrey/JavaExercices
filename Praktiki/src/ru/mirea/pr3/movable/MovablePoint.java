package ru.mirea.pr3.movable;

public class MovablePoint implements Movable {
    int x, y;
    int xSpeed, ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public void moveUp() {
    }

    @Override
    public void moveDown() {
    }

    @Override
    public void moveLeft() {
    }

    @Override
    public void moveRight() {
    }

    @Override
    public String toString() {
        return "x: " + x + ", y: " + y + ", xSpeed: " + xSpeed + ", ySpeed: " + ySpeed;
    }
}
