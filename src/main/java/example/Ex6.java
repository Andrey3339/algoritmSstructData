/*
Необходимо сравнить скорость работы 2 алгоритмов вычисления чисел
Фибоначчи и определить, какой из них работает быстрее. Так различия
начнутся уже с 40 члена последовательности.
 */

package example;

public class Ex6 {
    public static void main(String[] args) {

        int n = Ex4.getN();

        long startTime = System.nanoTime();
        Ex4.fib(n);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("duration rec = " + duration); //divide by 1000000 to get milliseconds.

        startTime = System.nanoTime();
        Ex5.fib(n);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("duration lin= " + duration); //divide by 1000000 to get milliseconds.
    }
}
