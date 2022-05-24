package creational.builderpattern.classes;

public class Wall {
    private Room fromRoom;
    private Room toRoom;

    public static Wall commonWall(Room r1, Room r2){
        return new Wall(r1, r2);
    }

    private Wall(Room r1, Room r2){
        fromRoom = r1;
        toRoom = r2;
    }
}
