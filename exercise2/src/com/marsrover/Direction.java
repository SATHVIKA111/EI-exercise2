package com.marsrover;

public enum Direction {
    NORTH, EAST, SOUTH, WEST;

    public Direction turnLeft() {
        switch (this) {
            case NORTH: return WEST;
            case WEST: return SOUTH;
            case SOUTH: return EAST;
            case EAST: return NORTH;
        }
        throw new IllegalStateException("Unexpected direction: " + this);
    }

    public Direction turnRight() {
        switch (this) {
            case NORTH: return EAST;
            case EAST: return SOUTH;
            case SOUTH: return WEST;
            case WEST: return NORTH;
        }
        throw new IllegalStateException("Unexpected direction: " + this);
    }
}
