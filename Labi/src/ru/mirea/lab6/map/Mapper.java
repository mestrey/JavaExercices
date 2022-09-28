package ru.mirea.lab6.map;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Mapper extends JPanel implements MouseListener {
    private Board board;

    private int screenSize;
    private int cellSize;

    public Mapper(int screenSize, int mapSize) {
        this.screenSize = screenSize;
        this.cellSize = screenSize / mapSize;
        board = new Board(mapSize);
        addMouseListener(this);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (int i = 0; i < board.getGrid().length; i++)
            for (int j = 0; j < board.getGrid()[i].length; j++) {
                Cell cell = board.getGrid()[i][j];

                if (cell == Cell.WATER)
                    g.setColor(Color.BLUE);
                else if (cell == Cell.STONE)
                    g.setColor(Color.GRAY);
                else if (cell == Cell.DIRT)
                    g.setColor(Color.ORANGE);

                g.fillRect(i * cellSize, j * cellSize, cellSize, cellSize);
            }
    }

    public void run() {
        JFrame frame = new JFrame("Map");
        frame.add(this);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(screenSize, screenSize);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
        Cell cell = board.getCellAt(e.getX() / cellSize, e.getY() / cellSize);
        JOptionPane.showMessageDialog(this, cell);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
}
