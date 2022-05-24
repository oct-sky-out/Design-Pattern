package creational.builderpattern.classes;

import java.util.ArrayList;
import java.util.List;

public class Maze {
    List<Room> rooms = new ArrayList<>();

    public void addRoom(Room room){
        rooms.add(room);
    }

    public Room getRoom(int n){
        try {
            return rooms.get(n);
        }catch (IndexOutOfBoundsException e){
            return null;
        }
    }
}
