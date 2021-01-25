package com.company.java7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    //    Возвращает число, на которое уменьшилось поле food
    public int decreaseFood(int n) {
        int v;
        if (food - n >= 0) {
            v = n;
            food -= n;
        } else {
            v = food;
            food -= food;
        }
        return v;
    }

    public void increaseFood(int n) {
        food += n;
    }

    public void info() {
        System.out.println("plate: " + food);
    }
}

