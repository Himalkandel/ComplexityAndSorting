package Shapes;

public class Cylinder extends GeometricShape {
    private double radius;

    public Cylinder(double height, double radius) {
        super(height);
        this.radius = radius;
    }

    @Override
    public double getVolume() {
        return Math.PI * radius * radius * height;
    }

    @Override
    public double getBaseArea() {
        return Math.PI * radius * radius;
    }
}