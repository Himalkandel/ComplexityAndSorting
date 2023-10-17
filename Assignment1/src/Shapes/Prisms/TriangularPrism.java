package Shapes.Prisms;

import Shapes.Prism;

public class TriangularPrism extends Prism {
    private double sideLength;

    public TriangularPrism(double height, double sideLength) {
        super(height);
        this.sideLength = sideLength;
    }

    @Override
    public double getBaseArea() {
        return (Math.sqrt(3) / 4.0) * Math.pow(sideLength, 2);
    }

    @Override
    public double getVolume() {
        return getBaseArea() * height;
    }
}
