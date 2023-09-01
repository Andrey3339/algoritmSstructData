package examples2;

import org.w3c.dom.ls.LSOutput;

public class HeapSort {
    public static void main(String[] args) {
        //int[] array = {5, 2, 8, 12, 1, 7};
        System.out.println("Исходный массив: ");
        int[] array = BubbleSort.prepareArray(50);
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
        heapSort(array);

        System.out.println("Отсортированный массив:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
    public static void heapSort(int[] array) {
        int n = array.length;

        // Построение пирамиды (heapify)
        for (int i = n / 2 - 1; i >= 0; i--) {
            //System.out.println(i + "  ");
            heapify(array, n, i);

        }
        //System.out.println("-----------");
        // Извлечение элемента из пирамиды и перестроение
        for (int i = n - 1; i > 0; i--) {
            // Перемещаем текущий корень в конец массива
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
//            for (int num : array) {
//                System.out.print(num + " ");
//            }
//            System.out.println();
            // Перестраиваем пирамиду для оставшейся части массива
            heapify(array, i, 0);
        }
    }

    public static void heapify(int[] array, int n, int i) {
        int largest = i;
        int leftChild = 2 * i + 1; // Индекс левого потомка
        int rightChild = 2 * i + 2; // Индекс правого потомка
        //System.out.println(leftChild + "  " + rightChild);
        // Сравнение левого потомка с корнем
        if (leftChild < n && array[leftChild] > array[largest]) {
            largest = leftChild;
        }

        // Сравнение правого потомка с корнем
        if (rightChild < n && array[rightChild] > array[largest]) {
            largest = rightChild;
        }

        // Если корень не является наибольшим элементом, меняем местами с наибольшим потомком
        if (largest != i) {
            int temp = array[i];
            array[i] = array[largest];
            array[largest] = temp;
//            for (int num : array) {
//                System.out.print(num + " ");
//            }
//            System.out.println();
            // Рекурсивно перестраиваем пирамиду для затронутой под-пирамиды
            heapify(array, n, largest);
        }
    }
}
