package Shapes.Prisms;

import Shapes.Prism;

public class OctagonalPrism extends Prism {

    private double sideLength;

    public OctagonalPrism(double height, double sideLength) {
        super(height);
        this.sideLength = sideLength;
    }

    @Override
    public double getBaseArea() {
        return 2 * (1 + Math.sqrt(2)) * sideLength * sideLength;
    }

    @Override
    public double getVolume() {
        return getBaseArea() * height;
    }
}
