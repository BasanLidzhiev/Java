package com.company.java6;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void run(int length) {
        if (length <= 200) {
            super.run(length);
        } else System.out.println("Расстояние слишком большое");
    }

    @Override
    public void swim(int length) {
        System.out.println("Коты не умеют плавать");
    }
}
