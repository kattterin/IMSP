package com.example.imsp.module1;

import java.util.Scanner;

public class Lesson4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       double a = scanner.nextDouble();
       double b = scanner.nextDouble();
       boolean result = a > b;
       System.out.println(result ? "A > B" : "A < = B");
        if (result) {
            System.out.println("A greatest");
        } else {
            System.out.println("A letest");
        }
       boolean yes = true;
       boolean no = !yes;
       System.out.println(yes);
       System.out.println(no);
    }
}
