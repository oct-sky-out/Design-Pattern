package creational.builderpattern.builder;

import creational.builderpattern.classes.Maze;

public class CountingMazeBuilder implements MazeBuilder{
    private int rooms;
    private int doors;

    public CountingMazeBuilder() {
        this.rooms = 0;
        this.doors = 0;
    }


    @Override
    public MazeBuilder buildMaze() {
        MazeBuilder.super.buildMaze();
        return this;
    }

    @Override
    public MazeBuilder buildRoom(int n) {
        this.rooms++;
        return this;
    }

    @Override
    public MazeBuilder buildDoor(int roomFrom, int roomTo) {
        doors++;
        return this;
    }

    @Override
    public Maze getMaze() {
        throw new RuntimeException("not support");
    }

    public MazeBuilder setCounts(int rooms, int doors){
        this.rooms = rooms;
        this.doors = doors;
        return this;
    }
}
