//done by gpt but no errors -- this procides a bubblesort method that sorts array of gemetricshaped based on the heights
package Utils;

import Shapes.GeometricShape;

public class SortingUtility {

    public static void bubbleSort(GeometricShape[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    // swap arr[j+1] and arr[j]
                    GeometricShape temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
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

    // Heap sort
    public static void heapSort(GeometricShape[] arr) {
        int n = arr.length;

        // build max heap size
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // extract elements one by one from the heap
        for (int i = n - 1; i > 0; i--) {
            // move max element to the end of the heap
            GeometricShape temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // call max heapify on reduced heap
            heapify(arr, i, 0);
        }
    }

    private static void heapify(GeometricShape[] arr, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 1;

        // if left element is larger than the root
        if (left < n && arr[left].compareTo(arr[largest]) > 0) {
            largest = left;
        }

        // if right element is larger than the largest so far
        if (right < n && arr[right].compareTo(arr[largest]) > 0) {
            largest = right;
        }

        // if largest element is not root
        if (largest != i) {
            GeometricShape swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr, n, largest);
        }

    }
}
