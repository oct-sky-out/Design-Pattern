package creational.builderpattern.classes;

import creational.builderpattern.builder.MazeBuilder;

public class MazeGame {
    public static Maze createMaze(MazeBuilder builder){
        builder.buildMaze();

        builder.buildRoom(1);
        builder.buildRoom(2);
        builder.buildDoor(1, 2);

        return builder.getMaze();
    }
}
