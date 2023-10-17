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
        String line = scanner.nextLine();
        String[] parts = line.split(" ");
    
        for (int i = 0; i < parts.length; i+=3) { // We're increasing by 3 since there's a name followed by 2 parameters for each shape
            String shapeType = parts[i];
    
            switch (shapeType) {
                case "Cylinder":
                    Cylinder cylinder = new Cylinder(Double.parseDouble(parts[i+1]), Double.parseDouble(parts[i+2]));
                    shapeList.add(cylinder);
                    break;
                case "Pyramid":
                    Pyramid pyramid = new Pyramid(Double.parseDouble(parts[i+1]), Double.parseDouble(parts[i+2]));
                    shapeList.add(pyramid);
                    break;
                case "OctagonalPrism":
                    OctagonalPrism octagonalPrism = new OctagonalPrism(Double.parseDouble(parts[i+1]), Double.parseDouble(parts[i+2]));
                    shapeList.add(octagonalPrism);
                    break;
                case "PentagonalPrism":
                    PentagonalPrism pentagonalPrism = new PentagonalPrism(Double.parseDouble(parts[i+1]), Double.parseDouble(parts[i+2]));
                    shapeList.add(pentagonalPrism);
                    break;
                case "SquarePrism":
                    SquarePrism squarePrism = new SquarePrism(Double.parseDouble(parts[i+1]), Double.parseDouble(parts[i+2]));
                    shapeList.add(squarePrism);
                    break;
                case "TriangularPrism":
                    TriangularPrism triangularPrism = new TriangularPrism(Double.parseDouble(parts[i+1]), Double.parseDouble(parts[i+2]));
                    shapeList.add(triangularPrism);
                    break;
                case "Cone":
                    Cone cone = new Cone(Double.parseDouble(parts[i+1]), Double.parseDouble(parts[i+2]));
                    shapeList.add(cone);
                    break;
                default:
                    System.out.println("Unknown shape type in file: " + shapeType);
                    break;
            }
        }
    
        scanner.close();
        return shapeList;
    }
    
}
