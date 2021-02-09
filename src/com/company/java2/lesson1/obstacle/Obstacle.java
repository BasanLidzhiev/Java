package com.company.java2.lesson1.obstacle;

import com.company.java2.lesson1.participants.Cat;
import com.company.java2.lesson1.participants.Human;
import com.company.java2.lesson1.participants.Robot;

public interface Obstacle {
    public void action(Cat cat);
    public void action(Human human);
    public void action(Robot robot);

}
