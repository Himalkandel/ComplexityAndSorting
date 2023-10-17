package Main;

import Shapes.*;
import Utils.*;
import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args) throws Exception {
        // Assuming file path is the first argument. Adjust accordingly.
        ArrayList<GeometricShape> shapes = FileUtility.readShapesFromFile(args[0]);

        // Sorting based on height
        Collections.sort(shapes);

        // Sorting based on base area
        Collections.sort(shapes, new BaseAreaComparator());

        // Sorting based on volume
        Collections.sort(shapes, new VolumeComparator());

    }
}
