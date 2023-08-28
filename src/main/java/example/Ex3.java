/*
1. Необходимо написать алгоритм поиска всех доступных комбинаций (посчитать количество) для количества
кубиков K с количеством граней N.
2. У вас есть 2 варианта на выбор – количество кубиков может быть строго ограничено (4 кубика, например),
либо их количество будет динамическим. Выбор за вами.
3. Если вы реализуете простой вариант, обращает внимание, что данное решение имеет сложность O(n4),
но если количество кубиков сделать переменной, то она трансформируется в O(nk), что будет представлять
собой экспоненциальную сложность. Для второго решения очевидно, что его сложность O(nk) с самого начала.
 */
package example;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        int n = getN();
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    for (int l = 0; l < n; l++) {
                        count++;
                    }
                }
            }
        }
        System.out.println("The number of combinations for 4 dice with " + n + " sides each is: " + count);
    }

    /**
     * @return returns the entered number n
     * @apiNote method for entering number n
     */
    private static int getN() {
        System.out.print("Enter the number of faces of the cube: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
