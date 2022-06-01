package creational.factorymethod;

import creational.factorymethod.factory.SnackFactory;

public class Main {
    public static void main(String[] args) {
        Snack potatoSnack = SnackFactory.buyPringles();
        Snack shrimpSnack = SnackFactory.buySewookkang();

        potatoSnack.open();
        shrimpSnack.open();
    }
}
