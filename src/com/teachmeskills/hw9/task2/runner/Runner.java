package com.teachmeskills.hw9.task2.runner;

import com.teachmeskills.hw9.task2.utils.Utils;

/**
 * Class with method main to run the program
 * array1 and array2 are declared and initialized
 * the method displayArray is used three times: to output array1, to output array2 and to output the product of array1 and array2
 */
public class Runner {
    public static void main(String[] args) {

        int[][] array1 = new int[][]{{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 0, 0}};
        int[][] array2 = new int[][]{{1, 2, 3}, {1, 1, 1}, {0, 0, 0}, {2, 1, 0}};

        System.out.println();
        System.out.println("First array: ");
        Utils.displayArray(array1);
        System.out.println();
        System.out.println("Second array: ");
        Utils.displayArray(array2);
        System.out.println();

        if (array1[0].length != array2.length) {
            System.out.println("Array multiplication is not possible! The number of columns of the first array must be equal to the number of rows of the second array");
        } else {
            System.out.println("Array multiplication is equal to: ");
            Utils.displayArray(Utils.multiplicationArray(array1, array2));
        }
    }
}
