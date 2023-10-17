package Shapes.Prisms;

import Shapes.Prism;

public class SquarePrism extends Prism {

    private double sideLength;

    public SquarePrism(double height, double sideLength) {
        super(height);
        this.sideLength = sideLength;
    }

    @Override
    public double baseArea() {
        return sideLength * sideLength;
    }
}
