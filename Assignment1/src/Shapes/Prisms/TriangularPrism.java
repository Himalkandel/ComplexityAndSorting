package Shapes.Prisms;

import Shapes.Prism;

public class TriangularPrism extends Prism {

    private double baseLength;
    private double heightOfTriangle;

    public TriangularPrism(double height, double baseLength, double heightOfTriangle) {
        super(height);
        this.baseLength = baseLength;
        this.heightOfTriangle = heightOfTriangle;
    }

    @Override
    public double baseArea() {
        return 0.5 * baseLength * heightOfTriangle;
    }
}
