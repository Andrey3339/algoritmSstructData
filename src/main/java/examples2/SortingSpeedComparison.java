/*
1.Пишем тесты для сравнения производительности сортировки больших массивов.
2.Для наглядного результата стоит сравнивать массивы до 100 000 элементов.
При таком подходе будет явно видно, какая из сортировок окажется быстрее
 */

package examples2;
/*
long startTime = System.nanoTime();
        Ex4.fib(n);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("duration rec = " + duration); //divide by 1000000 to get milliseconds.
 */
public class SortingSpeedComparison {
    public static void main(String[] args) {
        int[] array = BubbleSort.prepareArray(100000);

        long startTime = System.nanoTime();
        BubbleSort.bubbleSortOptimized(array);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("Bubble sort = " + duration); //divide by 1000000 to get milliseconds.

        int[] array2 = BubbleSort.prepareArray(100000);

        startTime = System.nanoTime();
        QuickSort2.quickSort(array2, 0, array2.length - 1);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Quick2 sort = " + duration); //divide by 1000000 to get milliseconds.
    }
}
