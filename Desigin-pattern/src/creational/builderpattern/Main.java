package creational.builderpattern;

import creational.builderpattern.builder.CountingMazeBuilder;
import creational.builderpattern.builder.MazeBuilder;
import creational.builderpattern.builder.StandardMazeBuilder;
import creational.builderpattern.classes.MazeGame;

public class Main {
    public static void main(String[] args) {
        MazeBuilder builder1 = new StandardMazeBuilder();
        MazeBuilder builder2 = new CountingMazeBuilder();


        // 조금 더 응용하면, 체이닝 메서드 형식으로도 사용가능하다.
        builder1.buildMaze()
            .buildRoom(1)
            .buildRoom(2)
            .buildDoor(1, 2)
            .getMaze();

        builder2.buildMaze()
            .buildRoom(1)
            .buildRoom(2)
            .buildDoor(1, 2)
            .getMaze();

        MazeGame.createMaze(builder1);
        MazeGame.createMaze(builder2);
    }
}
