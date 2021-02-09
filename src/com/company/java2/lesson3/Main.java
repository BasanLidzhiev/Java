package com.company.java2.lesson3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String[] wordsArray = {"apple", "get", "cow", "challenge", "apple", "interceptor",
                "multimedia", "cow", "tiger", "good", "bad"};
        printUniqueWords(wordsArray);
        for (Map.Entry<String, Integer> entry : countEveryWord(wordsArray).entrySet()) {
            System.out.println("Word: " + entry.getKey() + " occurs: " + entry.getValue());
        }
    }

    private static void printUniqueWords(String[] array) {
        boolean isUnique = true;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].equals(array[j])) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                System.out.println(array[i]);
            }
            isUnique = true;
        }
    }

    private static Map<String, Integer> countEveryWord(String[] array) {
        Map<String, Integer> map = new HashMap<>();
        int sum = 1;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].equals(array[j]))
                sum++;
            }
            if (!map.containsKey(array[i])) {
                map.put(array[i], sum);
            }
            sum = 1;
        }
        return map;
    }
}
