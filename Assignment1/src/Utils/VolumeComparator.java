package Utils;

import Shapes.GeometricShape;
import java.util.Comparator;

public class VolumeComparator implements Comparator<GeometricShape> {
    @Override
    public int compare(GeometricShape shape1, GeometricShape shape2) {
        return Double.compare(shape1.getVolume(), shape2.getVolume());
    }
}
