package ru.phoenigm.java.course;

public class ClassExample {

    public static void main(String[] args) {

        Car car = new Car();
        car.type = "BMW";

        String name = "Azat";
        int age = 222;
        double height = 111.0;

        Person person = new Person(name, age, height, car);
        System.out.println("Name azat: " + person.name);
        System.out.println("Height azat: " + person.height);
        System.out.println("Age azat: " + person.age);


        person.sayMyName();
        person.sayMyHeight();
        person.sayMyCarType();

        Calculator calculator = new Calculator();
        double plusResult = calculator.plus(2.02, 3.0);
        System.out.println(plusResult);

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
     *
     * @param array входная переменная, в которой передается массив
     * @return сумма элементов всего переданного массива
     */
    static int sumArray(int[] array) {
        int sum = 0;
        // код
        return sum;
    }

}
