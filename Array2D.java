package org.example;

import java.util.Random;
import java.util.Scanner;

public class Array2D {
    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int row = scn.nextInt();

        System.out.print("Enter number of columns: ");
        int col = scn.nextInt();

        int[][] arr= new int[row][col];

        Random rand = new Random();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j]=  rand.nextInt(1000);
            }
        }

        // Printing Elements of Arrays
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
        scn.close();
        int max = arr[0][0];
        int min = arr[0][0];

        for (int[] ints : arr) {
            for (int j = 0; j < arr[0].length; j++) {
                if (max < ints[j]) {
                    max = ints[j];
                }

                if (min > ints[j]) {
                    min = ints[j];
                }
            }
        }
        System.out.println("Min: " + min + "\n" + "Max: " + max);

    }
}