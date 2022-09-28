package ru.mirea.lab6.map;

public class Board {
    private Cell[][] grid;

    public Board(int size) {
        grid = new Cell[size][size];
        fillGrid();
    }

    private void fillGrid() {
        Noisy noisy = new Noisy(1);
        for (int i = 0; i < grid.length; i++)
            for (int j = 0; j < grid[i].length; j++) {
                float val = noisy.smoothNoise2D(i, j);

                if (val > -0.1)
                    if (val > 0.2)
                        grid[i][j] = Cell.STONE;
                    else
                        grid[i][j] = Cell.DIRT;
                else
                    grid[i][j] = Cell.WATER;
            }
    }

    public Cell[][] getGrid() {
        return grid;
    }

    public Cell getCellAt(int i, int j) {
        return grid[i][j];
    }
}
