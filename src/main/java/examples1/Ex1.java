/*
Необходимо написать алгоритм, считающий сумму всех чисел от 1 до N.
Согласно свойствам линейной сложности, количество итераций цикла будет
линейно изменяться относительно изменения размера N
 */

package examples1;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        int sum = 0;
        int n = getN();
        sum = getSum(n, sum);
        printSum(sum, n);
    }

    /**
     * @param sum sum
     * @param n   number n
     * @apiNote method prints the sum of numbers from 1 to n
     */
    private static void printSum(int sum, int n) {
        System.out.println("Sum of numbers from 1 to " + n + " is: " + sum);
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

    /**
     * @param n   the number up to which we calculate the sum
     * @param sum variable to calculate the sum
     * @return sum
     * @apiNote method that calculates the sum of all numbers from 1 to n
     */
    private static int getSum(int n, int sum) {
        for (int i = 0; i < n; i++) {
            sum += i;
        }
        return sum;
    }
}
