package com.company;

import java.util.Random;
import java.util.Scanner;

public class Java3 {
    public static void main(String[] args) throws InterruptedException {
//        1 задание
        guessNumber();
//        2 задание
        guessWord();
    }

    static void guessNumber() throws InterruptedException {
        Random random = new Random();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            int doAgain;
            System.out.println("Введите число");
            int randomNumber = random.nextInt(10);
            for (int i = 0; i < 3; i++) {
                int number = scanner.nextInt();
                if (number > randomNumber) {
                    System.out.println("Указанное число больше");
                } else if (number < randomNumber) System.out.println("Указанное число меньше");
                else if (number == randomNumber) {
                    System.out.println("Вы угадали!");
                    Thread.sleep(1000);
                    break;
                }
            }
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
            doAgain = scanner.nextInt();
            if (doAgain == 0) break;
        }
    }

    static void guessWord() {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
                "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        Random random = new Random();
        String randomWord = words[random.nextInt(words.length)];
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите слово");
            String word = scanner.nextLine();
            if (word.equals(randomWord)) {
                System.out.println("Вы угадали!");
                break;
            } else {
                System.out.println("Вы не угадали :(");
                char[] arr = new char[15];
                for (int i = 0; i < arr.length; i++) {
                    if (i < randomWord.length() && i < word.length() && word.charAt(i) == randomWord.charAt(i))
                        arr[i] = word.charAt(i);
                    else arr[i] = '#';
                    System.out.print(arr[i]);
                }
                System.out.println();
            }
        }
    }
}
