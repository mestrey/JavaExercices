package ru.mirea.lab5.animation;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

import ru.mirea.lab5.utils.Point;

public class Animation extends JPanel {
    private final int spriteWidth = 112;
    private final int spriteHeight = 133;

    private Point spritePosition;

    public Animation() {
        this.spritePosition = new Point(0, 0);
    }

    private void changeSprite() {
        int x = (spritePosition.getX() + 1) % 12;
        spritePosition.setX(x);

        if (x == 0)
            spritePosition.setY((spritePosition.getY() + 1) % 11);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(400, 400);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        try {
            BufferedImage image = ImageIO
                    .read(new File("/Users/yovan/Programming/Java/Labi/src/ru/mirea/lab5/animation/sprites.png"));

            g.drawImage(
                    image.getSubimage(
                            spritePosition.getX() * spriteWidth, spritePosition.getY() * spriteHeight,
                            spriteWidth, spriteHeight).getScaledInstance(500, 500, Image.SCALE_DEFAULT),
                    -50, -100,
                    this);

            changeSprite();

            try {
                Thread.sleep(40);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            repaint();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void run() {
        JFrame frame = new JFrame("Animation");
        frame.add(this);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
