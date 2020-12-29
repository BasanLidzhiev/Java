package com.company.java6;

public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    @Override
    public void run(int length) {
        if (length <= 500) {
            super.run(length);
        } else System.out.println("Расстояние слишком большое");
    }

    @Override
    public void swim(int length) {
        if (length <= 10) {
            super.swim(length);
        } else System.out.println("Расстояние слишком большое");
    }
}
