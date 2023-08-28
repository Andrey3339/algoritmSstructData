/*
Написать алгоритм поиска простых чисел (делятся только на себя и на 1) в диапазоне от 1 до N.
В алгоритме будет использоваться вложенный for, что явно говорит о квадратичной сложности,
на этом стоит акцентировать внимание.
 */

package example;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        int n = getN();
        findSimpleNumbers(n);
    }

    /**
     * @param n prime number search range
     * @apiNote method searches for and displays prime numbers in the range from 1 to n
     */
    private static void findSimpleNumbers(int n) {
        boolean flag;
        for (int i = 1; i <= n; i++) {
            flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag)
                System.out.print(i + " ");
        }
    }

    /**
     * @return returns the entered number n
     * @apiNote method for entering number n
     */
    private static int getN() {
        System.out.print("Enter the number: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
