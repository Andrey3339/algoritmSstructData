/*
1.Необходимо написать один из простых алгоритмов сортировки, имеющий сложность O(n2).
2.Можно выбрать из пузырьковой сортировки, сортировки вставками и сортировки выбором.
3.Следует обратить внимание на сложность данных алгоритмов и указать признаки
квадратичной сложности для каждого из них.
 */
package examples2;

import java.util.Random;
import java.util.Scanner;

public class BubbleSort {
    private static final Random random = new Random();

    public static void main(String[] args) {

        int n = getLengthArray();
        int[] array = prepareArray(n);
        printArray(array);
        //int[] arrayTemp = {25, 3, 8, 79, 27, 15, 39, 25, 84, 53};
        int[] arraySortBubble = bubbleSortOptimized(array);
        printArray(arraySortBubble);
        //printArray(array);
        //arraySortBubble = bubbleSortOptimized(array);
        //printArray(arraySortBubble);
    }

    /**
     * @return возвращает длинну массива
     * @apiNote метод для ввода длинны массива
     */
    private static int getLengthArray() {
        System.out.print("Введите размер массива: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        return n;
    }

    /**
     * @param array массива для вывода
     * @apiNote метод для вывода массива
     */
    static void printArray(int[] array) {
        String result = "array = [";
        for (int i : array) {
            result += i + ", ";
        }
        result = result.substring(0, result.length() - 2) + "]";
        System.out.println(result);
    }

    /**
     * @param length количество элементов массива
     * @return метод возвращает массив случайных чисел размером n
     * @apiNote подготовка массива случайных чисел
     */
    static int[] prepareArray(int length) {
        int[] result = new int[length];
        for (int i = 0; i < result.length; i++) {
            result[i] = random.nextInt(100);
        }
        return result;
    }

    /**
     * @param array исходный массив для сортировки
     * @return отсортированный массив
     * @apiNote метод для сортировки массива
     */
    static int[] bubbleSort(int[] array) {
        int temp;
        for (int i = 0; i < array.length - 1 ; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
    static int[] bubbleSortOptimized(int[] array)
    {
        boolean flag;
        do
        {
            flag = false;
            for(int i = 0; i < array.length - 1; i++)
            {
                if (array[i] > array[i + 1])
                {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    flag = true;
                }
            }
        } while (flag);
        return array;
    }
}
