package Shapes;

public abstract class Prism {
    protected double height;

    public Prism(double height) {
        this.height = height;
    }

    public abstract double baseArea();

    public double volume() {
        return baseArea() * height;
    }
}
