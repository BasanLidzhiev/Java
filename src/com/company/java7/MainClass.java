package com.company.java7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.TreeMap;

public class MainClass {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 105);
        Plate plate = new Plate(100);
        plate.info();
        cat.eat(plate);
        plate.info();
        System.out.println(cat.toString());
        System.out.println();
        Plate plate1 = new Plate(90);
        Cat[] cats = {new Cat("Vaska", 20), new Cat("Borka", 15),
                new Cat("Maska", 25), new Cat("Cat", 40)};
        for (Cat c : cats) {
            c.eat(plate1);
            System.out.println(c.getName() + " сыт? " + c.isFull());
            System.out.println("После " + c.getName() + " в тарелке осталось " + plate1.getFood());
        }

    }
}
