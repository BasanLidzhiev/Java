package com.company.java2.lesson1.obstacle;

import com.company.java2.lesson1.participants.Cat;
import com.company.java2.lesson1.participants.Human;
import com.company.java2.lesson1.participants.Robot;

public class Wall implements Obstacle {
    private int high;

    public Wall(int high) {
        this.high = high;
    }

    public void action(Cat cat) {
        if (cat.getMaxBounce() > this.high) {
            System.out.println(cat.getClass() + " " + cat.getName() + " успешно перепрыгнул");
            cat.setAbleToPassObstacle(true);
        }
        else {
            System.out.println(cat.getClass() + " " + cat.getName() + " не смог перепрыгнуть");
            cat.setAbleToPassObstacle(false);
        }

    }

    public void action(Human human) {
        if (human.getMaxBounce() > this.high) {
            System.out.println(human.getClass() + " " + human.getName() + " успешно перепрыгнул");
            human.setAbleToPassObstacle(true);
        }
        else {
            System.out.println(human.getClass() + " " + human.getName() + " не смог перепрыгнуть");
            human.setAbleToPassObstacle(false);
        }

    }

    public void action(Robot robot) {
        if (robot.getMaxBounce() > this.high)
        {
            System.out.println(robot.getClass() + " " + robot.getName() + " успешно перепрыгнул");
            robot.setAbleToPassObstacle(true);
        }
        else {
            System.out.println(robot.getClass() + " " + robot.getName() + " не смог перепрыгнуть");
            robot.setAbleToPassObstacle(false);
        }
    }


    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }
}
