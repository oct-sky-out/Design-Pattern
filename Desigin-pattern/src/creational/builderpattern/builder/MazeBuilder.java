package creational.builderpattern.builder;

import creational.builderpattern.classes.Maze;

public interface MazeBuilder {
    default MazeBuilder buildMaze() {
        return null;
    };

    default MazeBuilder buildRoom(int n) {
        return null;
    };

    default MazeBuilder buildDoor(int roomFrom, int roomTo){
        return null;
    };

    default Maze getMaze() {
        return null;
    }
}
