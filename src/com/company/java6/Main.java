package com.company.java6;

public class Main {
    public static void main(String[] args) {
        Animal bobik = new Dog("bobik");
        bobik.run(300);
        bobik.swim(150);
        Animal sharik = new Dog("Sharik");
        sharik.run(501);
        sharik.swim(300);
        Animal vaska = new Cat("Vaska");
        vaska.run(200);
        Cat chernish = new Cat("Chernish");
        chernish.swim(300);

        System.out.println(Animal.COUNTER);
    }
}
