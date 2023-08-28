/*
1. Пишем алгоритм поиска нужного числа последовательности Фибоначчи.
2. Считаем, что 1 и 2 значения последовательности равны 1.
3. Искать будем по формуле On=On-1+On-2 что предполагает использовать рекурсивного алгоритма.
 */

package example;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        int n = getN();
        long Fn = fib(n);
        System.out.println("Fibonacci number from " + n + " equals: " + Fn);
    }

    /**
     * @param n номер числа Фибоначчи
     * @return метод возвращает число Фибоначчи с номером n
     * @apiNote алгоритм поиска числа Фибоначчи с номером n
     */
    public static long fib(int n) {
        if (n <= 2)
            return 1;
        return fib(n - 1) + fib(n - 2);
    }

    /**
     * @return returns the entered number n
     * @apiNote method for entering number n
     */
    public static int getN() {
        System.out.print("Enter Fibonacci Number: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
