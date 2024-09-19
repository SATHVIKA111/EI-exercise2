package com.marsrover;

public class MarsRoverSimulation {
    public static void main(String[] args) {
        Grid grid = new Grid(10, 10, new boolean[10][10]);
        Rover rover = new Rover(0, 0, Direction.NORTH, grid);

        Command moveCommand = new MoveCommand();
        Command turnLeftCommand = new TurnLeftCommand();
        Command turnRightCommand = new TurnRightCommand();

        System.out.println(rover); // Rover is at (0, 0) facing NORTH

        moveCommand.execute(rover);
        System.out.println(rover); // Rover is at (0, 1) facing NORTH

        turnRightCommand.execute(rover);
        moveCommand.execute(rover);
        System.out.println(rover); // Rover is at (1, 1) facing EAST

        turnLeftCommand.execute(rover);
        moveCommand.execute(rover);
        System.out.println(rover); // Rover is at (1, 2) facing NORTH
    }
}
