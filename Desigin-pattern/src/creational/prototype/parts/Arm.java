package creational.prototype.parts;

import java.util.Objects;

public class Arm{
    private int fingerCount;

    public Arm(int fingerCount) {
        this.fingerCount = fingerCount;
    }

    public int getFingerCount() {
        return fingerCount;
    }

    public void setFingerCount(int fingerCount) {
        this.fingerCount = fingerCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Arm arm = (Arm) o;
        return fingerCount == arm.fingerCount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(fingerCount);
    }

    @Override
    public String toString() {
        return "Arm{" +
            "fingerCount=" + fingerCount +
            '}';
    }
}
