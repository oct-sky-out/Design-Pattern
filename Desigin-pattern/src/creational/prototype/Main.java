package creational.prototype;

import creational.prototype.parts.Arm;
import creational.prototype.parts.Body;
import creational.prototype.parts.Head;
import creational.prototype.parts.Leg;

public class Main {
    public static void main(String[] args) {
        Robot robotA = new Robot("CODE-1")
            .initArm(new Arm(3))
            .initBody(new Body(100, 50))
            .initHead(new Head(128))
            .initLeg(new Leg(3, 45));

        Robot robotB = robotA.clone();

        System.out.println("CASE1 : " + robotA.equals(robotB));

        robotB.getArms().setFingerCount(5);

        System.out.println("CASE2 : " + robotA.equals(robotB));

        robotB.initArm(new Arm(4));

        System.out.println("CASE3 : " + robotA.equals(robotB));

        System.out.println(robotA);
        System.out.println(robotB);
    }
}
