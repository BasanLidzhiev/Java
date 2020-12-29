package com.company;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe5x5 {
    public static void main(String[] args) {
        start();
    }

    static void start() {
        char[][] field = createField();

        while (true) {

            drawField(field);

            doPlayerMove(field);
            if (checkWin(field, 'X')) {
                System.out.println("Congrats!!!");
                System.out.println("Player is winner!!!");
                break;
            }
            if (checkDraw(field)) {
                System.out.println("Sorry, game is draw!!!");
                System.out.println("Bey!!!");
                break;
            }

            doAIMove(field);
            if (checkWin(field, 'O')) {
                System.out.println("Sorry!!!");
                System.out.println("AI is winner!!!");
                break;
            }
            if (checkDraw(field)) {
                System.out.println("Sorry, game is draw!!!");
                System.out.println("Bey!!!");
                break;
            }
        }
    }

    static boolean checkDraw(char[][] field) {
        int freeCells = field.length * field.length;

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j] != '-') {
                    freeCells--;
                }
            }
        }

        return freeCells == 0;
    }

    static boolean checkWin(char[][] field, char sign) {
        // Horizontal
        boolean result = true;

        for (char[] chars : field) {
            for (int j = 1; j < chars.length && result; j++)
                result = chars[j] == sign;
            if (result) return true;
            result = true;
        }

        result = true;
        for (char[] chars : field) {
            for (int j = 0; j < chars.length-1 && result; j++)
                result = chars[j] == sign;
            if (result) return true;
            result = true;
        }

        // Vertical
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length - 1 && result; j++)
                result = field[j][i] == sign;
            if (result) return true;
            result = true;
        }

        for (int i = 0; i < field.length; i++) {
            for (int j = 1; j < field[i].length && result; j++)
                result = field[j][i] == sign;
            if (result) return true;
            result = true;
        }

        // Diagonal
        result = true;
        for (int i = 0; i < field.length - 1 && result; i++) {
            result = field[i][i] == sign;
        }
        if (result) return true;

        result = true;
        for (int i = 1; i < field.length && result; i++) {
            result = field[i][i] == sign;
        }
        if (result) return true;

        result = true;
        for (int i = 0; i < field.length - 1 && result; i++) {
            result = field[i][field.length - 1 - i] == sign;
        }
        if (result) return true;

        result = true;
        for (int i = 1; i < field.length && result; i++) {
            result = field[i][field.length - 1 - i] == sign;
        }
        return result;

    }

    static void doPlayerMove(char[][] field) {
        int x, y;

        do {
            x = chooseCoordinate(field.length, 'X');
            y = chooseCoordinate(field.length, 'O');
        } while (field[x][y] != '-');

        field[x][y] = 'X';

        drawField(field);
        drawSeparator();
    }

    static void doAIMove(char[][] field) {
        Random random = new Random();
        int x, y;

        do {
            x = random.nextInt(field.length);
            y = random.nextInt(field.length);
        } while (field[x][y] != '-');

        field[x][y] = 'O';
        drawField(field);
        drawSeparator();
    }

    static int chooseCoordinate(int maxLength, char sign) {
        Scanner scanner = new Scanner(System.in);

        int coord;
        do {
            System.out.printf("Please enter %s-coord in range [1..3]%n", sign);
            coord = scanner.nextInt() - 1;
        } while (coord < 0 || coord >= maxLength);

        return coord;
    }

    static char[][] createField() {
        return new char[][]{
                {'-', '-', '-', '-', '-'},
                {'-', '-', '-', '-', '-'},
                {'-', '-', '-', '-', '-'},
                {'-', '-', '-', '-', '-'},
                {'-', '-', '-', '-', '-'}
        };
    }

    static void drawSeparator() {
        for (int i = 0; i < 2; i++) {
            System.out.println();
        }
    }

    static void drawField(char[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                System.out.print(field[i][j]);
            }
            System.out.println();
        }
    }
}