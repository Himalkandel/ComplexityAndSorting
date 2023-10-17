package Shapes;

public class Cone extends GeometricShape {
    private double radius;

    public Cone(double height, double radius) {
        super(height);
        this.radius = radius;
    }

    @Override
    public double getVolume() {
        return (1/3.0) * Math.PI * radius * radius * height;
    }

    @Override
    public double getBaseArea() {
        return Math.PI * radius * radius;
    }
}
