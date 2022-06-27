package structure.bridge.playable;

public class DrpgGame implements RpgGame{
    private int stage = 1;
    private int level = 1;
    private long myMony = 1000;

    @Override
    public void killMonster() {
        System.out.println("victory!");
        this.stage++;
        this.myMony += 100;
        System.out.println("MyMoney : " + getMyMoney());
    }

    @Override
    public void levelUp() {
        this.level++;
    }

    @Override
    public void buyItem() {
        System.out.println("bought Item!");
        this.myMony -= 100;
    }

    @Override
    public void wearCloth() {
        System.out.println("wear Cloth");
    }

    @Override
    public void mountWeapon() {
        System.out.println("mount weapon!");
    }

    @Override
    public long getMyMoney() {
        return this.myMony;
    }
}
