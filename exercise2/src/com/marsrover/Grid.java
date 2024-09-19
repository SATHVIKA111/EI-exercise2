package com.marsrover;

public class Grid {
    private final int width;
    private final int height;
    private final boolean[][] obstacles;

    public Grid(int width, int height, boolean[][] obstacles) {
        this.width = width;
        this.height = height;
        this.obstacles = obstacles;
    }

    public boolean isInBounds(int x, int y) {
        return x >= 0 && x < width && y >= 0 && y < height;
    }

    public boolean hasObstacle(int x, int y) {
        return obstacles[x][y];
    }
}
