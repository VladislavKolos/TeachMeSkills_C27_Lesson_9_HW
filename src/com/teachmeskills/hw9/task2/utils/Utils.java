package com.teachmeskills.hw9.task2.utils;

/**
 * The class contains a static method for displaying arrays on the screen
 * the class contains a static method multiplying array1 by array2
 */
public class Utils {

    public static void displayArray(int[][] array) {
        for (int[] row : array) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public static int[][] multiplicationArray(int[][] array1, int[][] array2) {

        final int[][] array3 = new int[array1.length][array2[0].length];
        for (int i = 0; i < array3.length; i++) {
            for (int j = 0; j < array3[0].length; j++) {
                array3[i][j] = 0;
                for (int k = 0; k < array1[0].length; k++) {
                    array3[i][j] += array1[i][k] * array2[k][j];
                }
            }
        }
        return array3;
    }
}
