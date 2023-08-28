/*
1.Пишем алгоритм поиска нужного числа последовательности Фибоначчи, но в этот раз
откажемся от рекурсии и воспользуемся обычным алгоритмом, что даст нам
линейную сложность, т.к. вычисление каждого из чисел последовательности будет
происходить ровно 1 раз.
2.Вариантов решения может быть несколько, но нужно предложить студентам считать
последовательность с первого числа и далее до тех пор, пока не доберемся до
нужного номера. При этом значение предыдущих элементов нужно сохранять, чтобы
не приходилось вычислять заново, как это происходило при рекурсивном методе.
 */

package example;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {

        int n = getN();
        System.out.println(fib(n));

    }

    /**
     * @param n номер числа Фибоначчи
     * @return метод возвращает число Фибоначчи с номером n
     * @apiNote нерекурсивный алгоритм поиска числа Фибоначчи с номером n
     */
    public static long fib(long n) {
        long num = 0;
        long n1 = 1;
        long n2 = 1;
        if (n <= 2)
            return 1;
        for (int i = 3; i <= n; i++) {
            num = n2 + n1;
            n1 = n2;
            n2 = num;
        }
        return num;
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
