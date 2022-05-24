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
    public void buildMaze() {
        MazeBuilder.super.buildMaze();
    }

    @Override
    public void buildRoom(int n) {
        this.rooms++;
    }

    @Override
    public void buildDoor(int roomFrom, int roomTo) {
        doors++;
    }

    @Override
    public Maze getMaze() {
        throw new RuntimeException("not support");
    }

    public void setCounts(int rooms, int doors){
        this.rooms = rooms;
        this.doors = doors;

    }
}
