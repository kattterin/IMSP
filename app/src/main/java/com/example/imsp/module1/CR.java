package com.example.imsp.module1;

import java.util.Scanner;

public class CR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int[][] A = new int[n][m];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                A[i][j] = i * j;
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
//        do {
//            System.out.println("*");
//            x--;
//        } while (x >= 0);
//        int k = 0;
//        for (int i = 308305; i > 8305; i -= 2) {
//            i--;
//            k += 1;
//        }
//        System.out.println(k);
//        int N = scanner.nextInt();
//
//        int i = 0;
//        while (i <= N)
//        {
//            i++;
//            if (N % i != 0) continue;
//            System.out.println(i);
//        }



    }
}
/*3 */