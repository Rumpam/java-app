package com.company;

public class Person {
    int age;
    float weight;

    public static int sum;

    public static void write(String str) {
        System.out.print(str);
    }

    void say(String str) {
        System.out.println(str);
    }

    Person(int age, float weight) {
        this.age = age;
        this.weight = weight;
    }

    Person() {}
}
