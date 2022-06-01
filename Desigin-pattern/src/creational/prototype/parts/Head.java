package creational.prototype.parts;

import java.util.Objects;

public class Head {
    private final int cpuCount;

    public Head(int cpuCount) {
        this.cpuCount = cpuCount;
    }

    public int getCpuCount() {
        return cpuCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Head head = (Head) o;
        return cpuCount == head.cpuCount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpuCount);
    }

    @Override
    public String toString() {
        return "Head{" +
            "cpuCount=" + cpuCount +
            '}';
    }
}
