package com.company;

public class Java2 {
    public static void main(String[] args) {
// 1 задание
        int[] numbers = {0, 1, 0, 1, 0, 1};
        for (int a : numbers) {
            if (a == 0) a = 1;
            else a = 0;
        }
// 2 задание
        int[] numbers2 = new int[8];
        for (int i = 0; i < numbers2.length; i++) {
            int number = 0;
            numbers2[i] = number;
            number += 3;
        }
// 3 Задание
        int[] numbers3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int a : numbers3) {
            if (a < 6) a *= 2;
        }
// 4 задание
        int[][] numbers4 = new int[3][3];
        System.out.println();
        for (int i = 0; i < numbers4.length; i++) {
            for (int j = 0; j < numbers4[i].length; j++) {
                if (i == j) numbers4[i][j] = 1;
            }
        }
// 5 задание
        int[] numbers5 = {2, 3, 1, 345, 12, 31, 4};
        int min = findMin(numbers5);
        int max = findMax(numbers5);

// 6 задание
        int[] numbers6 = {2, 2, 2, 1, 2, 2, 10, 1};
        System.out.println(checkBalance(numbers6));

// 7 задание
        int[] numbers7 = {3, 5, 6, 1};
        int[] numbers8 = { 1, 2, 3 };
        displacement(numbers7, 2);
        displacement(numbers8, -1);


    }

    private static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
        }
        return min;
    }

    private static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }
        return max;
    }

    private static boolean checkBalance(int[] arr) {
        int sumLeft = arr[0];
        int sumRight = 0;
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                sumRight += arr[j];
            }
            if (sumRight == sumLeft) return true;
            else {
                sumLeft += arr[i];
                sumRight = 0;
            }
        }
        return false;
    }

    private static void displacement(int[] arr, int n) {
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                int cache = arr[0];
                for (int j = 0; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length - 1] = cache;
            }
        } else {
            for (int i = n; i < 0; i++) {
                int cache = arr[arr.length - 1];
                for (int j = arr.length - 1; j > 0 ; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[0] = cache;
            }
        }
    }
}