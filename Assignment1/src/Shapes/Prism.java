package Shapes;

public abstract class Prism extends GeometricShape {

    public Prism(double height) {
        super(height);
    }

    public abstract double getBaseArea();

    public double volume() {
        return getBaseArea() * height;
    }
}
