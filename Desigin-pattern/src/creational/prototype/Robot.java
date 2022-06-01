package creational.prototype;

import creational.prototype.parts.Arm;
import creational.prototype.parts.Body;
import creational.prototype.parts.Head;
import creational.prototype.parts.Leg;
import java.util.Objects;

public class Robot {
    private final String name;
    private Arm arms;
    private Leg legs;
    private Head head;
    private Body body;

    public Robot(String name) {
        this.name = name;
    }

    public Robot initArm(Arm arm){
        this.arms = arm;
        return this;
    }

    public Robot initLeg(Leg leg){
        this.legs = leg;
        return this;
    }

    public Robot initBody(Body body){
        this.body = body;
        return this;
    }

    public Robot initHead(Head head){
        this.head = head;
        return this;
    }

    public Robot clone() {
        Robot clone = new Robot(this.name);
        clone.head = new Head(this.head.getCpuCount());
        clone.legs = new Leg(this.legs.getLegCount(), this.legs.getMaxSpeed());
        clone.arms = new Arm(this.arms.getFingerCount());
        clone.body = new Body(this.body.getWidth(), this.body.getHeight());
        return clone;
    }

    public String getName() {
        return name;
    }

    public Arm getArms() {
        return arms;
    }

    public Leg getLegs() {
        return legs;
    }

    public Head getHead() {
        return head;
    }

    public Body getBody() {
        return body;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Robot robot = (Robot) o;
        return name.equals(robot.name) && arms.equals(robot.arms) && legs.equals(robot.legs) &&
            head.equals(robot.head) && body.equals(robot.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, arms, legs, head, body);
    }

    @Override
    public String toString() {
        return "Robot{" +
            "name='" + name + '\'' +
            ", arms=" + arms +
            ", legs=" + legs +
            ", head=" + head +
            ", body=" + body +
            '}';
    }
}
