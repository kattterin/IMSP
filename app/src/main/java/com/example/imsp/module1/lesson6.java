package com.example.imsp.module1;

import java.util.Scanner;

public class lesson6 {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        int i = 1;
        int max = scanner.nextInt();
        int n = scanner.nextInt();
//        while ((i <= n) && run) {
//            System.out.println(i);
//            i += 2;
////            System.out.println((int)(Math.random() * 100));
//            Thread.sleep(1000);
//            run = i <= 7;
        int x = scanner.nextInt();
        while (i < n && x != 0) {
            x = scanner.nextInt();
            if (x > max) {
                System.out.println("incorrect");
                continue;
            }
            System.out.println(x * x);
            i++;
        }


    }
}
