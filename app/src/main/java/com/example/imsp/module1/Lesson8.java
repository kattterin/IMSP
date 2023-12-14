package com.example.imsp.module1;

import java.util.Arrays;
import java.util.Scanner;

public class Lesson8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[8];
        int[] arr2 = new int[arr.length];
        Arrays.fill(arr, 66);
        System.arraycopy(arr, 0, arr2, 0, arr.length);
        Arrays.fill(arr2, 7);
        arr[3] = 4;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
        System.out.println( Arrays.toString(arr));

        int[][] arr3 = new int[4][4];
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                arr3[i][j] =  i + j ;
                System.out.print(arr3[i][j] + "\t");

            }
            System.out.println("");

        }
    }

}
