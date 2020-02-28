package com.company;

    interface Animal {
        private void walk() {}
        private void run() {};
    }

public class Interface implements Animal {
    public void walk() {
        System.out.println("animal is walking");
    }
    public void run() {
        System.out.println("animal is running");
    }
}
