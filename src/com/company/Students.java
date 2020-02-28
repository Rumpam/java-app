package com.company;

public class Students extends Person {
    int course;

    public Students(int age, float weight, int cource) {
        super(age, weight);
        this.course = cource;
    }
}
