package com.company;

public class Arra {

    public static void main(String[] args) {
        char[][] arr = new char[][]{
                {'1', '2', '3'},
                {'4', '5', '6'},
                {'7', '8', '9'}
        };
        checkWin(arr, 'X');
    }


    static boolean checkWin(char[][] field, char sign) {
        // Horizontal
        boolean result = true;

        for (char[] chars : field) {
            for (int j = 0; j < chars.length && result; j++)
                result = chars[j] == sign;
            if (result) return true;
        }

        // Vertical
        result = true;
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++)
                result = field[j][i] == sign;
            return result;

        }

        // Diagonal
        if (field[0][0] == sign && field[1][1] == sign && field[2][2] == sign) {
            return true;
        }

        if (field[0][2] == sign && field[1][1] == sign && field[2][0] == sign) {
            return true;
        }

        return false;
    }
}
