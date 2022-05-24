package creational.builderpattern.builder;

import creational.builderpattern.classes.Door;
import creational.builderpattern.classes.Maze;
import creational.builderpattern.classes.Room;
import creational.builderpattern.classes.Wall;
import java.util.Objects;

public class StandardMazeBuilder implements MazeBuilder{
    private Maze currentMaze;

    @Override
    public MazeBuilder buildMaze() {
        this.currentMaze = new Maze();
        return this;
    }

    @Override
    public MazeBuilder buildRoom(int n) {
        if(Objects.nonNull(currentMaze.getRoom(n))){
            currentMaze.addRoom(new Room(n));
        }
        return this;
    }

    @Override
    public MazeBuilder buildDoor(int roomFrom, int roomTo) {
        Room from = currentMaze.getRoom(roomFrom);
        Room to = currentMaze.getRoom(roomTo);
        Door door = new Door(from, to);

        from.setSide(Wall.commonWall(from, to), door);
        to.setSide(Wall.commonWall(to, from), door);
        return this;
    }

    @Override
    public Maze getMaze() {
        return this.currentMaze;
    }
}
