package structure.bridge.playable;

public class MmoRpgGame implements RpgGame{
    private int level = 1;
    private long myMoney = 10000;

    @Override
    public void killMonster() {
        System.out.println("victory!");
    }

    @Override
    public void levelUp() {
        this.level++;
    }

    @Override
    public void buyItem() {
        System.out.println("buy Item!");
    }

    @Override
    public void wearCloth() {
        System.out.println("Wear Cloth!");
    }

    @Override
    public void mountWeapon() {
        System.out.println("Mount Weapon!");
    }

    @Override
    public long getMyMoney() {
        return this.myMoney;
    }
}
