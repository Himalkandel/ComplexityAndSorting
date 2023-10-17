package Shapes;

public abstract class GeometricShape implements Comparable<GeometricShape> {

    protected double height;

    public GeometricShape(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public abstract double getVolume();

    public abstract double getBaseArea();

    @Override
    public int compareTo(GeometricShape other) {
        return Double.compare(this.height, other.height);
    }

    public static int compareByBaseArea(GeometricShape a, GeometricShape b) {
        return Double.compare(a.getBaseArea(), b.getBaseArea());
    }

    public static int compareByVolume(GeometricShape a, GeometricShape b) {
        return Double.compare(a.getVolume(), b.getVolume());
    }
}
