//this one was done by gpt, i fixed errors but uncertain
package Utils;

import Shapes.GeometricShape;
import java.util.Comparator;

public class BaseAreaComparator implements Comparator<GeometricShape> {
    @Override
    public int compare(GeometricShape shape1, GeometricShape shape2) {
        return Double.compare(shape1.getBaseArea(), shape2.getBaseArea());
    }
}
