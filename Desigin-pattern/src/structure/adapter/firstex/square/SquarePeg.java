package structure.adapter.firstex.square;

public class SquarePeg {
    private long width;

    public SquarePeg(long width) {
        this.width = width;
    }

    public long getWidth() {
        return width;
    }

    public double getSquare(){
        return Math.pow(this.width, 2); // 정사각형이라는 가정하.
    }
}
