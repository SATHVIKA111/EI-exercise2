package com.marsrover;

public class Rover {
    private int x;
    private int y;
    private Direction direction;
    private Grid grid;

    public Rover(int x, int y, Direction direction, Grid grid) {
        this.x = x;
        this.y = y;
        this.direction = direction;
        this.grid = grid;
    }

    public void move() {
        int newX = x;
        int newY = y;
        switch (direction) {
            case NORTH: newY++; break;
            case SOUTH: newY--; break;
            case EAST:  newX++; break;
            case WEST:  newX--; break;
        }
        if (grid.isInBounds(newX, newY) && !grid.hasObstacle(newX, newY)) {
            x = newX;
            y = newY;
        }
    }

    public void turnLeft() {
        direction = direction.turnLeft();
    }

    public void turnRight() {
        direction = direction.turnRight();
    }

    @Override
    public String toString() {
        return "Rover is at (" + x + ", " + y + ") facing " + direction;
    }
}
