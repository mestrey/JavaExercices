package ru.mirea.lab5.image;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.*;

public class ImageApp extends JPanel {
    private BufferedImage image;

    public ImageApp(String path) {
        try {
            this.image = ImageIO.read(new URL(path));
        } catch (IOException exp) {
            exp.printStackTrace();
        }
    }

    @Override
    public Dimension getPreferredSize() {
        return image == null ? super.getPreferredSize() : new Dimension(image.getWidth(), image.getHeight());
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (image != null) {
            int x = (getWidth() - image.getWidth()) / 2;
            int y = (getHeight() - image.getHeight()) / 2;
            g.drawImage(image, x, y, this);
        }
    }

    public void run() {
        JFrame frame = new JFrame("Image");
        frame.add(this);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
