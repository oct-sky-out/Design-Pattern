package creational.builderpattern.classes;

public class Door {
    private final Room fromRoom;
    private final Room toRoom;

    public Door(Room fromRoom, Room toRoom) {
        this.fromRoom = fromRoom;
        this.toRoom = toRoom;
    }
}
