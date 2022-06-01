package creational.prototype.parts;

import java.util.Objects;

public class Leg {
    private final int legCount;
    private final int maxSpeed;

    public Leg(int legCount, int maxSpeed) {
        this.legCount = legCount;
        this.maxSpeed = maxSpeed;
    }

    public int getLegCount() {
        return legCount;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Leg leg = (Leg) o;
        return legCount == leg.legCount && maxSpeed == leg.maxSpeed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(legCount, maxSpeed);
    }

    @Override
    public String toString() {
        return "Leg{" +
            "legCount=" + legCount +
            ", maxSpeed=" + maxSpeed +
            '}';
    }
}
