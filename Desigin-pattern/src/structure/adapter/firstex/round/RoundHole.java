package structure.adapter.firstex.round;

public class RoundHole {
    private double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public boolean isFit(RoundPeg peg){
        return this.radius >= peg.getRadius();
    }
}
