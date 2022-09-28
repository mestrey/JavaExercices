package ru.mirea.lab5.figures;

import java.awt.*;
import java.awt.geom.*;

import ru.mirea.lab5.utils.Point;

public class Circle extends Shape {
    public Circle(Color color, Point position) {
        super(color, position);
    }

    @Override
    public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        Ellipse2D.Double circle = new Ellipse2D.Double(
                super.position.getX(), super.position.getY(),
                45, 45);

        g2d.setColor(super.color);
        g2d.fill(circle);
    }
}
