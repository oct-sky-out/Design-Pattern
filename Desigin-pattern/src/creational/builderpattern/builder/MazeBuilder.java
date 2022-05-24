package creational.builderpattern.builder;

import creational.builderpattern.classes.Maze;

public interface MazeBuilder {
    default void buildMaze() {};

    default void buildRoom(int n) {};

    default void buildDoor(int roomFrom, int roomTo){};

    default Maze getMaze() {
        return null;
    }
}
