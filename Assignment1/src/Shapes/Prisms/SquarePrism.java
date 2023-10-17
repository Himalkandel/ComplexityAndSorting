package Shapes.Prisms;

import Shapes.Prism;

public class SquarePrism extends Prism {
    private double sideLength;

    public SquarePrism(double height, double sideLength) {
        super(height);
        this.sideLength = sideLength;
    }

    @Override
    public double getBaseArea() {
        return sideLength * sideLength;
    }

    @Override
    public double getVolume() {
        return getBaseArea() * height;
    }
}
