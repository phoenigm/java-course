package ru.phoenigm.java.course;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int size = in.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Введите число: ");
            array[i] = in.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            sum = sum + array[i];
            System.out.println("Текущая сумма: " + sum);

        }
        System.out.println("Результат: " + sum);
    }
}
