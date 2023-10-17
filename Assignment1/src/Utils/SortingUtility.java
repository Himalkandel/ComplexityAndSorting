//done by gpt but no errors -- this procides a bubblesort method that sorts array of gemetricshaped based on the heights
package Utils;

import Shapes.GeometricShape;

public class SortingUtility {

    public static void bubbleSort(GeometricShape[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j].compareTo(arr[j+1]) > 0) {
                    // swap arr[j+1] and arr[j]
                    GeometricShape temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }

    public static void insertionSort(GeometricShape[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            GeometricShape key = arr[i];
            int j = i - 1;

            // Move elements of arr[0..i-1] that are greater than key
            // to one position ahead of their current position
            while (j >= 0 && arr[j].compareTo(key) > 0) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}
