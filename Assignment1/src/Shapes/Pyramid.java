//this one might need to be redone, was kinda wonky for me, even asked gpt for this but the responses only confused me more
package Shapes;

public class Pyramid extends GeometricShape {
    private double baseLength; // I assumed here that it would be a square base 

    public Pyramid(double baseLength, double height) {
        super(height);  // this one will pass the height to superlcass constructor
        this.baseLength = baseLength;
    }

    @Override
    public double getBaseArea() {
        return baseLength * baseLength;
    }

    @Override
    public double getVolume() {
        return getBaseArea() * getHeight() / 3;
    }

    @Override
    public String toString() {
        return "Pyramid [Base Length: " + baseLength + ", Height: " + getHeight() 
               + ", Base Area: " + getBaseArea() + ", Volume: " + getVolume() + "]";
    }
}
