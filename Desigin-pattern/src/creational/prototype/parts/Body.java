package creational.prototype.parts;

import java.util.Objects;

public class Body {
    private final int width;
    private final int height;

    public Body(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Body body = (Body) o;
        return width == body.width && height == body.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, height);
    }

    @Override
    public String toString() {
        return "Body{" +
            "width=" + width +
            ", height=" + height +
            '}';
    }
}
