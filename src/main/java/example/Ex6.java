/*
Необходимо сравнить скорость работы 2 алгоритмов вычисления чисел
Фибоначчи и определить, какой из них работает быстрее. Так различия
начнутся уже с 40 члена последовательности.
 */

package example;

import java.util.Scanner;

//long startTime = System.nanoTime();
//        methodToTime();
//        long endTime = System.nanoTime();
//        long duration = (endTime - startTime); //divide by 1000000 to get milliseconds.
public class Ex6 {
    public static void main(String[] args) {

        int n = getN();

        long startTime = System.nanoTime();
        fibRec(n);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("duration rec = " + duration);

        startTime = System.nanoTime();
        fibLin(n);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("duration lin= " + duration);
    }

    /**
     * @param n номер числа Фибоначчи
     * @return метод возвращает число Фибоначчи с номером n
     * @apiNote алгоритм поиска числа Фибоначчи с номером n
     */
    public static long fibRec(int n) {
        if (n <= 2)
            return 1;
        return fibRec(n - 1) + fibRec(n - 2);
    }

    /**
     * @return returns the entered number n
     * @apiNote method for entering number n
     */
    private static int getN() {
        System.out.print("Enter Fibonacci Number: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    /**
     * @param n номер числа Фибоначчи
     * @return метод возвращает число Фибоначчи с номером n
     * @apiNote нерекурсивный алгоритм поиска числа Фибоначчи с номером n
     */
    public static long fibLin(long n) {
        long num = 0;
        long n1 = 1;
        long n2 = 1;
        if (n == 1)
            return 1;
        if (n == 2)
            return 2;
        for (int i = 3; i <= n; i++) {
            num = n2 + n1;
            n1 = n2;
            n2 = num;
        }
        return num;
    }
}
