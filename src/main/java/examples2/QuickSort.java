/*
Написать алгоритм быстрого поиска (quicksort).
 */

package examples2;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = {5, 2, 8, 12, 1, 7};

        quickSort(array, 0, array.length - 1);

        System.out.println("Отсортированный массив:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(array, low, high);
            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }

    public static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                i++;
                // swap array[i] and array[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // swap array[i + 1] and array[high]
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;
    }
}
