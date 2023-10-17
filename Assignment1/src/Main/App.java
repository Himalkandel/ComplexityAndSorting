package Main;

import Utils.SortingUtility;
import Utils.FileUtility;
import Shapes.GeometricShape;
import java.util.ArrayList;
import java.util.Scanner;


//mainly to get user input on which selection to use

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Starting the application...");

            if (args.length == 0) {
                System.out.println("No file path provided!");
                return;
            }

            // this reads using fileutility
            System.out.println("Reading shapes from file...");
            ArrayList<GeometricShape> shapes = FileUtility.readShapesFromFile(args[0]);

            System.out.println("Choose a sorting method:");
            System.out.println("1. Bubble Sort");
            System.out.println("2. Insertion Sort");
            // add the options based on case numbers

            scanner.nextLine();  // leftover newlines
            System.out.println("Waiting for user input...");
            int choice = scanner.nextInt();

            GeometricShape[] shapesArray = shapes.toArray(new GeometricShape[0]);

            switch (choice) {
                case 1:
                    System.out.println("Performing Bubble Sort...");
                    SortingUtility.bubbleSort(shapesArray);
                    System.out.println("Sorted using Bubble Sort!");
                    break;
                case 2:
                    System.out.println("Performing Insertion Sort...");
                    SortingUtility.insertionSort(shapesArray);
                    System.out.println("Sorted using Insertion Sort!");
                    break;
                // Add the other sorting method cases here
                default:
                    System.out.println("Invalid choice!");
            }

            System.out.println("Application finished.");
        } finally {
            scanner.close(); // Ensure the scanner object is always closed
        }
    }
}
