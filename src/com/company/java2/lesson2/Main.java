package com.company.java2.lesson2;

public class Main {
    public static void main(String[] args) {
        String[][] array0 = {{"1", "2", "3", "4"}, {"1", "2", "-3", "4"}, {"1", "2", "3", "-4"}, {"1", "2", "3", "4"}};
        String[][] array1 = {{"1", "2", "asd", "4"}, {"1", "2", "-3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};
        String[][] array2 = {{"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};
        try {
            System.out.println(arrayElementAddition(array0));
        } catch (MySizeArrayException | MyArrayDataException e) {
            e.printStackTrace();
        }
        try {
            System.out.println(arrayElementAddition(array1));
        } catch (MySizeArrayException | MyArrayDataException e) {
            e.printStackTrace();
        }
        try {
            System.out.println(arrayElementAddition(array2));
        } catch (MySizeArrayException | MyArrayDataException e) {
            e.printStackTrace();
        }
    }

    static int arrayElementAddition(String[][] array) throws MyArrayDataException, MySizeArrayException {
        int sum = 0;
        if (array.length == 4 && array[0].length == 4) {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if (array[i][j].matches("-?[0-9]+")) {
                        sum += Integer.parseInt(array[i][j]);
                        array[i][j] = String.valueOf(Integer.parseInt(array[i][j]));
                    } else throw new MyArrayDataException("В ячейке " + i + " " + j + " должно лежит число!");
                }
            }
        } else throw new MySizeArrayException("Размер массива должен быть 4х4!");
        return sum;
    }
}
