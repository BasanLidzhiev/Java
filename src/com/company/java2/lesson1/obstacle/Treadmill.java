package com.company.java2.lesson1.obstacle;

import com.company.java2.lesson1.participants.Cat;
import com.company.java2.lesson1.participants.Human;
import com.company.java2.lesson1.participants.Robot;

public class Treadmill implements Obstacle{
    private int length;

    public Treadmill(int length) {
        this.length = length;
    }

    public void action(Cat cat) {
        if (cat.getMaxDistance() > this.length)
        {
            System.out.println(cat.getClass() + " " + cat.getName() + " успешно пробежал");
            cat.setAbleToPassObstacle(true);
        }
        else {
            System.out.println(cat.getClass() + " " + cat.getName() + " не смог пробежать");
            cat.setAbleToPassObstacle(false);
        }
    }

    public void action(Human human) {
        if (human.getMaxDistance() > this.length) {
            System.out.println(human.getClass() + " " + human.getName() + " успешно пробежал");
            human.setAbleToPassObstacle(true);
        }
        else {
            System.out.println(human.getClass() + " " + human.getName() + " не смог пробежать");
            human.setAbleToPassObstacle(false);
        }
    }

    public void action(Robot robot) {
        if (robot.getMaxDistance() > this.length) {
            System.out.println(robot.getClass() + " " + robot.getName() + " успешно пробежал");
            robot.setAbleToPassObstacle(true);
        }
        else {
            System.out.println(robot.getClass() + " " + robot.getName() + " не смог пробежать");
            robot.setAbleToPassObstacle(false);
        }
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
