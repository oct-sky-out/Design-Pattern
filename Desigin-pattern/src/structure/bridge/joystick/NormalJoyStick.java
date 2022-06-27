package structure.bridge.joystick;

import structure.bridge.playable.RpgGame;

public class NormalJoyStick implements RemotableJoyStick {
    private final RpgGame rpgGame;

    public NormalJoyStick(RpgGame rpgGame) {
        this.rpgGame = rpgGame;
    }

    @Override
    public void pushButtonA() {
        rpgGame.killMonster();
    }

    @Override
    public void pushButtonB() {
        rpgGame.levelUp();
    }

    @Override
    public void pushButtonX() {
        rpgGame.mountWeapon();
    }

    @Override
    public void pushButtonY() {
        rpgGame.wearCloth();
    }

    @Override
    public void pushButtonAB() {
        rpgGame.buyItem();
    }

    @Override
    public void pushButtonAX() {
        rpgGame.getMyMoney();
    }
}
