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
            System.out.println("3. Selection Sort");
            System.out.println("4. Merge Sort");
            System.out.println("5. Quick Sort");
            System.out.println("6. Heap Sort");
            // add the options based on case numbers

            System.out.print("Select Sorting Algorithm: ");
            int choice = scanner.nextInt();

            GeometricShape[] shapesArray = shapes.toArray(new GeometricShape[0]);

            switch (choice) {
                case 1:
                    System.out.println("Performing Bubble Sort...");
                    long bubbleSortStart = System.currentTimeMillis(); // start time of the bubble sort
                    SortingUtility.bubbleSort(shapesArray);
                    System.out.println("Sorted array:");
                    for (GeometricShape shape : shapesArray) {
                        System.out.println(shape);
                    }
                    long bubbleSortEnd = System.currentTimeMillis(); // end time of the bubble sort
                    System.out.println("Sorted using Bubble Sort!");
                    System.out.println("Time taken: " + (bubbleSortEnd - bubbleSortStart) + " milliseconds");

                    break;
                case 2:
                    System.out.println("Performing Insertion Sort...");
                    long insertionSortStart = System.currentTimeMillis();
                    SortingUtility.insertionSort(shapesArray);
                    System.out.println("Sorted array:");
                    for (GeometricShape shape : shapesArray) {
                        System.out.println(shape);
                    }
                    long insertionSortEnd = System.currentTimeMillis();
                    System.out.println("Sorted using Insertion Sort!");
                    System.out.println("Time taken: " + (insertionSortEnd - insertionSortStart) + " milliseconds");
                    break;
                case 3:
                    System.out.println("Performing Selection Sort...");
                    long selectionSortStart = System.currentTimeMillis();
                    SortingUtility.selectionSort(shapesArray);
                    System.out.println("Sorted array:");
                    for (GeometricShape shape : shapesArray) {
                        System.out.println(shape);
                    }
                    long selectionSortEnd = System.currentTimeMillis();
                    System.out.println("Sorted using Selection Sort!");
                    System.out.println("Time taken: " + (selectionSortEnd - selectionSortStart) + " milliseconds");
                    break;
                case 4:
                    System.out.println("Performing Merge Sort...");
                    long mergeSortStart = System.currentTimeMillis();
                    SortingUtility.mergeSort(shapesArray);
                    System.out.println("Sorted array:");
                    for (GeometricShape shape : shapesArray) {
                        System.out.println(shape);
                    }
                    long mergeSortEnd = System.currentTimeMillis();
                    System.out.println("Sorted using Merge Sort!");
                    System.out.println("Time taken: " + (mergeSortEnd - mergeSortStart) + " milliseconds");
                    break;
                case 5:
                    System.out.println("Performing Quick Sort...");
                    long quickSortStart = System.currentTimeMillis();
                    SortingUtility.quickSort(shapesArray, choice, choice);
                    System.out.println("Sorted array:");
                    for (GeometricShape shape : shapesArray) {
                        System.out.println(shape);
                    }
                    long quickSortEnd = System.currentTimeMillis();
                    System.out.println("Sorted using Quick Sort!");
                    System.out.println("Time taken: " + (quickSortEnd - quickSortStart) + " milliseconds");
                    break;
                case 6:
                    System.out.println("Performing Heap Sort...");
                    long heapSortStart = System.currentTimeMillis();
                    SortingUtility.heapSort(shapesArray);
                    System.out.println("Sorted array:");
                    for (GeometricShape shape : shapesArray) {
                        System.out.println(shape);
                    }
                    long heapSortEnd = System.currentTimeMillis();
                    System.out.println("Sorted using Heap Sort!");
                    System.out.println("Time taken: " + (heapSortEnd - heapSortStart) + " milliseconds");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

            System.out.println("Application finished.");
        } finally {
            scanner.close(); // Ensure the scanner object is always closed
        }
    }
}
