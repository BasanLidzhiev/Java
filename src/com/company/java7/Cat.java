package com.company.java7;

public class Cat {
    private String name;
    private int appetite;
    private boolean isFull;
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        isFull = false;
    }
    public void eat(Plate p) {
        appetite -= p.decreaseFood(appetite);
        if (appetite == 0) isFull = true;
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public boolean isFull() {
        return isFull;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", appetite=" + appetite +
                ", isFull=" + isFull +
                '}';
    }
}
