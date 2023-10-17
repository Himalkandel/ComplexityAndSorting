// this one was entirely from gpt lol, i fixed some imports but the adds seem to have errors, ill try fixing but i cant seem to find it yet
package Utils;

import Shapes.*;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import Shapes.Prisms.OctagonalPrism;
import Shapes.Prisms.PentagonalPrism;
import Shapes.Prisms.SquarePrism;
import Shapes.Prisms.TriangularPrism;


public class FileUtility {

    public static ArrayList<GeometricShape> readShapesFromFile(String filePath) throws Exception {
        ArrayList<GeometricShape> shapeList = new ArrayList<>();

        // Reading the shapes from file
        File file = new File(filePath);
        Scanner scanner = new Scanner(file);

        while(scanner.hasNext()) {
            String line = scanner.nextLine();
            String[] parts = line.split(" ");
            String shapeType = parts[0];

            switch(shapeType) {
                case "Cylinder":
                    Cylinder cylinder = new Cylinder(Double.parseDouble(parts[1]), Double.parseDouble(parts[2]));
                    shapeList.add(cylinder);
                    break;
                case "Pyramid":
                    Pyramid pyramid = new Pyramid(Double.parseDouble(parts[1]), Double.parseDouble(parts[2]));
                    shapeList.add(pyramid);
                    break;
                case "OctagonalPrism":
                    OctagonalPrism octagonalPrism = new OctagonalPrism(Double.parseDouble(parts[1]), Double.parseDouble(parts[2]));
                    shapeList.add(octagonalPrism);
                    break;
                case "PentagonalPrism":
                    PentagonalPrism pentagonalPrism = new PentagonalPrism(Double.parseDouble(parts[1]), Double.parseDouble(parts[2]));
                    shapeList.add(pentagonalPrism);
                    break;
                case "SquarePrism":
                    SquarePrism squarePrism = new SquarePrism(Double.parseDouble(parts[1]), Double.parseDouble(parts[2]));
                    shapeList.add(squarePrism);
                    break;
                case "TriangularPrism":
                    TriangularPrism triangularPrism = new TriangularPrism(Double.parseDouble(parts[1]), Double.parseDouble(parts[2]));
                    shapeList.add(triangularPrism);
                    break;
                // ... add more cases for other shape types as needed
                default:
                    System.out.println("Unknown shape type in file: " + shapeType);
                    break;
            }
        }

        scanner.close();
        return shapeList;
    }
}
