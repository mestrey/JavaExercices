package ru.mirea.lab5.figures;

import java.awt.Color;
import java.awt.Graphics;

import ru.mirea.lab5.utils.Point;

public abstract class Shape {
    protected Color color;
    protected Point position;

    public Shape(Color color, Point position) {
        this.color = color;
        this.position = position;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Point getPosition() {
        return position;
    }

    public void setPosition(Point position) {
        this.position = position;
    }

    public abstract void draw(Graphics g);
}
