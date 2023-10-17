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

    public static void selectionSort(GeometricShape[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j].compareTo(arr[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            GeometricShape temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    

    public static void mergeSort(GeometricShape[] arr) {
        mergeSort(arr, 0, arr.length - 1);
    }

    private static void mergeSort(GeometricShape[] arr, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    private static void merge(GeometricShape[] arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        GeometricShape[] left = new GeometricShape[n1];
        GeometricShape[] right = new GeometricShape[n2];

        for (int i = 0; i < n1; i++) {
            left[i] = arr[l + i];
        }

        for (int j = 0; j < n2; j++) {
            right[j] = arr[m + 1 + j];
        }

        int i = 0, j = 0, k = l;

        while (i < n1 && j < n2) {
            if (left[i].compareTo(right[j]) <= 0) {
                arr[k] = left[i];
                i++;
            }

            else {
                arr[k] = right[j];
                j++;
            }

            k++;
        }

        while (i < n1) {
            arr[k] = left[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }

    public static void quickSort(GeometricShape[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(GeometricShape[] arr, int low, int high) {
        GeometricShape pivot = arr[high];
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (arr[j].compareTo(pivot) < 0) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }

    private static void swap(GeometricShape[] arr, int i, int j) {
        GeometricShape temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
