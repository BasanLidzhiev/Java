package com.company.java2.lesson1.participants;

public class Cat implements Participant {
    private String name;
    private int maxDistance;
    private int maxBounce;
    private boolean isAbleToPassObstacle;

    public Cat(String name, int maxDistance, int maxBounce) {
        this.name = name;
        this.maxDistance = maxDistance;
        this.maxBounce = maxBounce;
    }

    public void run() {
        System.out.println("Cat running");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    public int getMaxBounce() {
        return maxBounce;
    }

    public void setMaxBounce(int maxBounce) {
        this.maxBounce = maxBounce;
    }

    public boolean isAbleToPassObstacle() {
        return isAbleToPassObstacle;
    }

    public void setAbleToPassObstacle(boolean ableToPassObstacle) {
        isAbleToPassObstacle = ableToPassObstacle;
    }
}
