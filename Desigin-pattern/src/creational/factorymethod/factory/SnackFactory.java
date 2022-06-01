package creational.factorymethod.factory;

import creational.factorymethod.Pringles;
import creational.factorymethod.Sewookkang;

public class SnackFactory {
    public static Pringles buyPringles(){
        return new Pringles();
    }

    public static Sewookkang buySewookkang(){
        return new Sewookkang();
    }
}
