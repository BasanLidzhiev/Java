package com.company.java6;

public class Animal {
    public String name;
    public static int COUNTER = 0;

    public Animal(String name) {
        COUNTER++;
        this.name = name;
    }

    public void run(int length) {
        System.out.println(name + " пробежал " + length + " м");
    }

    public void swim(int length) {
        System.out.println(name + " проплыл " + length + " м");
    }
}
