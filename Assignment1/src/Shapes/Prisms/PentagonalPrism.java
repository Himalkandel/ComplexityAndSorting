package Shapes.Prisms;

import Shapes.Prism;

public class PentagonalPrism extends Prism {

    private double sideLength;

    public PentagonalPrism(double height, double sideLength) {
        super(height);
        this.sideLength = sideLength;
    }

    @Override
    public double baseArea() {
        return (5.0 / 4.0) * sideLength * sideLength / Math.tan(Math.PI / 5.0);
    }
}
