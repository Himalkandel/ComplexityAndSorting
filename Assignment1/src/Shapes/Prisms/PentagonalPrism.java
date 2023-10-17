package Shapes.Prisms;

import Shapes.Prism;

public class PentagonalPrism extends Prism {
    private double sideLength;

    public PentagonalPrism(double height, double sideLength) {
        super(height);
        this.sideLength = sideLength;
    }

    @Override
    public double getBaseArea() {
        return (5.0 / 4.0) * (1.0 / Math.tan(Math.PI / 5.0)) * Math.pow(sideLength, 2);
    }

    @Override
    public double getVolume() {
        return getBaseArea() * height;
    }
}
