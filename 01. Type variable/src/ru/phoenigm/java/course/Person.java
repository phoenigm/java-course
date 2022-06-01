package ru.phoenigm.java.course;

public class Person {
    String name;
    int age;
    double height; // in meters
    Car car;

    public Person(String name, int age, double height, Car car) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.car = car;
    }

    public Person() {
    }

    void sayMyName() {
        System.out.println("Мое имя: " + name);
    }

    void sayMyHeight() {
        System.out.println("Мой рост: " + height);
    }

    void sayMyCarType() {
        System.out.println("Марка моей машины: " + car.type);
    }
}
