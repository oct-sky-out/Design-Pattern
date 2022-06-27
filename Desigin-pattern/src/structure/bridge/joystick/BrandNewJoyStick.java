package structure.bridge.joystick;

import structure.bridge.playable.RpgGame;

public class BrandNewJoyStick extends NormalJoyStick{
    public BrandNewJoyStick(RpgGame rpgGame) {
        super(rpgGame);
    }

    @Override
    public void pushButtonA() {
        super.pushButtonA();
        vibrate();
    }

    @Override
    public void pushButtonB() {
        super.pushButtonB();
        vibrate();
    }

    @Override
    public void pushButtonX() {
        super.pushButtonX();
        vibrate();
    }

    @Override
    public void pushButtonY() {
        super.pushButtonY();
        vibrate();
    }

    @Override
    public void pushButtonAB() {
        super.pushButtonAB();
        vibrate();
    }

    @Override
    public void pushButtonAX() {
        super.pushButtonAX();
        vibrate();
    }

    private void vibrate(){
        System.out.println("Bzzzzzzzzzzz");
    }
}
