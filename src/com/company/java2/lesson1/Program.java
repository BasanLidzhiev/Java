package com.company.java2.lesson1;

import com.company.java2.lesson1.obstacle.Obstacle;
import com.company.java2.lesson1.obstacle.Treadmill;
import com.company.java2.lesson1.obstacle.Wall;
import com.company.java2.lesson1.participants.Cat;
import com.company.java2.lesson1.participants.Human;
import com.company.java2.lesson1.participants.Participant;
import com.company.java2.lesson1.participants.Robot;

public class Program {
    public static void main(String[] args) {
        Participant[] participants = {new Cat("Cat", 10, 15),
                new Robot("Robot", 15, 18),
                new Human("Human", 20, 25)};
        Obstacle[] obstacles = {
                new Treadmill(13),
                new Wall(10),
                new Wall(15),
                new Wall(20),
                new Wall(22)
        };

        for (Participant participant : participants) {
            for (Obstacle obstacle : obstacles) {
                if (participant instanceof Cat)
                {
                    obstacle.action((Cat) participant);
                    if (!((Cat) participant).isAbleToPassObstacle())
                        break;
                }
                else if (participant instanceof Robot)
                {
                    obstacle.action((Robot) participant);
                    if (!((Robot) participant).isAbleToPassObstacle())
                        break;
                }
                else if (participant instanceof Human)
                {
                    obstacle.action((Human) participant);
                    if (!((Human) participant).isAbleToPassObstacle())
                        break;
                }
            }
        }



    }
}
