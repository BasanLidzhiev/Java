package com.company;

import java.time.Year;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int a = 0;
        double b = 0.0;
        short c = 1;
        float d = 4.0f;
        byte e = 1;
        char f = 'f';
        long g = 100000;
        boolean h = true;
        System.out.println(isLeap(2004));
    }

    public static float calculateExpression(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    public static boolean tenToTwenty(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    public static void negativeOrPositive(int a) {
        if (a >= 0) {
            System.out.println("Положительное число");
        } else System.out.println("Отрицательное число");
    }

    void pr() {

    }

    public static boolean isPositive(int a) {
        return a >= 0;
    }

    public static void helloName(String name) {
        System.out.println("Hello, " + name);
    }

    public static boolean isLeap(long year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
}
