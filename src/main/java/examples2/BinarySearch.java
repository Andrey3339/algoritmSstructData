package examples2;

public class BinarySearch {
    public static void main(String[] args) {

        int[] array = BubbleSort.prepareArray(100);
        QuickSort2.quickSort(array, 0, array.length - 1);
        BubbleSort.printArray(array);
        System.out.println();
        int result = binarySearch(10, array, 0, array.length - 1);
        System.out.println(result);
    }
    /**
     * @apiNote алгоритм бинарного поиска
     * @param value искомое значение
     * @param array массив, в котором ищется значение
     * @param min начальная позиция в массиве
     * @param max конечная позиция в массиве
     * @return индекс элемента
     */
    public static int binarySearch(int value, int[] array, int min, int max) {
        if (max < min)
            return -1;
        int middle = (max - min) / 2 + min;
        if (array[middle] > value) {
            return binarySearch(value, array, min, middle - 1);
        }
        else {
            if (array[middle] < value) {
                return binarySearch(value, array, middle + 1, max);
            }
            else {
                return middle;
            }
        }
    }
}
