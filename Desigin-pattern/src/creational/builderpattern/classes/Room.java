package creational.builderpattern.classes;

public class Room {
    private final int no;
    private Wall wall;
    private Door door;


    public Room(int no) {
        this.no = no;
    }

    public void setSide(Wall wall, Door door){
        this.wall = wall;
        this.door = door;
    }
}
