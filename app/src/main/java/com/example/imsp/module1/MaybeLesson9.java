package com.example.imsp.module1;

import java.util.Scanner;

public class MaybeLesson9 {
    public static void main(String[] args) {
//        double[][] a = new double[5][2];
////        Arrays.fill(a, 66.3);
//        for (int i = 0; i < a.length; i++) {
//            Arrays.fill(a[i], (int)(Math.random() * 12));
//            System.out.println(Arrays.toString(a[i]));
//        }

//        int[][] myArr = {{1, 13, 14, 5}, {9, 2, 6, 10}, {11, 7, 3, 12}, {8, 15, 16, 4}};

//        int[][] myArr = new int[2][8];
//        int[] intsa = {1, 13, 14, 5, 9, 2, 6, 10, 11, 7, 3, 12, 8, 15, 16, 4};
//        for (int i = 0; i < myArr.length; i++) {
//            for (int j = 0; j < myArr[i].length; j++) {
//                myArr[i][j] = intsa[j + i * myArr[i].length];
//                System.out.print(myArr[i][j] + "\t");
//            }
//            System.out.println();
//        }


//        double d = .0;
//        while (d < 10L) {
//            d++;
//        }
//        System.out.println((long) d);

        Scanner scanner = new Scanner(System.in);
        String primer = scanner.nextLine();
        String[] parts = primer.split(" \\+ ");
        double result = 0;
        for (String next : parts) {
            result += Double.valueOf((next)); // из str в int
        }
        System.out.println(result);
    }

}

