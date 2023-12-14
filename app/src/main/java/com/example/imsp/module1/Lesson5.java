package com.example.imsp.module1;

import java.util.Scanner;

public class Lesson5 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);

        calculation();
//        whilem();
    }

    static void whilem() {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        while (x < 5) {
            System.out.println("да");
            x++;
        }
    }

    static void calculation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите a");
        double a = scanner.nextDouble();
        System.out.println("введите b");
        double b = scanner.nextDouble();
        System.out.println("введите +-/*^");
        scanner.nextLine();
        String line = scanner.nextLine();
        char zn = (char) (line.charAt(0));
        switch (zn) {
            case '=':
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '/':
                System.out.println(a / b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '^':
                if (b - (double) ((int) b) == 0) {

                    double res = a;
                    for (int i = (int) (b) - 1; i > 0; i--) {
                        res *= a;
                    }
                    System.out.println(res);
                    break;
                } else {
                    System.out.println("в данном калькуляторе степень может быть только целой");
                    break;
                }
            default:
                System.out.println("такой операции нет");

        }


    }
}
