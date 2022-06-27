package structure.bridge;

import structure.bridge.joystick.BrandNewJoyStick;
import structure.bridge.joystick.NormalJoyStick;
import structure.bridge.joystick.RemotableJoyStick;
import structure.bridge.playable.DrpgGame;
import structure.bridge.playable.MmoRpgGame;
import structure.bridge.playable.RpgGame;

public class Main {
    public static void main(String[] args) {
        RpgGame mmoRpgGame = new MmoRpgGame();
        RpgGame drpgGame = new DrpgGame();

        System.out.println("Normal--------");
        testNormalJoyStick(mmoRpgGame);
        testNormalJoyStick(drpgGame);
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("Brand-New--------");
        testBrandNewJoyStick(mmoRpgGame);
        testBrandNewJoyStick(drpgGame);
    }

    private static void testNormalJoyStick(RpgGame rpgGame) {
        RemotableJoyStick normalJoyStick = new NormalJoyStick(rpgGame);

        normalJoyStick.pushButtonA();
        normalJoyStick.pushButtonB();
        normalJoyStick.pushButtonX();
        normalJoyStick.pushButtonY();
        normalJoyStick.pushButtonAB();
        normalJoyStick.pushButtonAX();

    }

    private static void testBrandNewJoyStick(RpgGame rpgGame) {
        RemotableJoyStick brandNewJoyStick = new BrandNewJoyStick(rpgGame);

        brandNewJoyStick.pushButtonA();
        brandNewJoyStick.pushButtonB();
        brandNewJoyStick.pushButtonX();
        brandNewJoyStick.pushButtonY();
        brandNewJoyStick.pushButtonAB();
        brandNewJoyStick.pushButtonAX();
    }
}
