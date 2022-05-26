package ru.phoenigm.java.course;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Введите размер массива: ");

        Scanner scanner = new Scanner(System.in);
        int sizeArray = scanner.nextInt();

        int[] array = new int[sizeArray];
        printArray(array);

        for (int i = 0; i < array.length; i++) {
            System.out.println("Введите число: ");
            array[i] = scanner.nextInt();
        }

        System.out.println("После заполнения массива пользователем: ");
        printArray(array);
        // строчки с 25 по 29 должны переместиться из main и замениться на вызов функции
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum(sum, array[i]);
            System.out.println("Текущая сумма: " + sum);
        }
        System.out.println("Результат: " + sum);

        System.out.println(sum(100, 200));
    }


    static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Текущий элемент в индексе i=" + i + " array[i]=" + array[i]);
        }
    }

    static int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    /**
     * @param array входная переменная, в которой передается массив
     * @return сумма элементов всего переданного массива
     */
    static int sumArray(int[] array) {
        int sum = 0;
        // код
        return sum;
    }

}
