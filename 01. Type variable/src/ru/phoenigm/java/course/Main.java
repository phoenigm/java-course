package ru.phoenigm.java.course;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] array = {2, 4, 5};

        // String + int = String
        // String + String = String

        String line = "Мой возраст " + array[0] + " лет" ;

        System.out.println(line);
        System.out.println("В строке символов: " + line.length());
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
     * Нужно реализовать эту функцию sumArray
     * @param array входная переменная, в которой передается массив
     * @return сумма элементов всего переданного массива
     */
    static int sumArray(int[] array) {
        int sum = 0;
        // код
        return sum;
    }

}
