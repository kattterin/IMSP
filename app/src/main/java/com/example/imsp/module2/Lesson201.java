package com.example.imsp.module2;

import com.example.imsp.module2.Rect;

public class Lesson201 {
    public static void main(String[] args) {
        Rect r1 = new Rect();
        Rect r2 = new Rect();
        r1.setHeight(10);
        r1.setWidth(-5);
        r2.setHeight(r1.getHeight());
        r2.setWidth(6);
        double x = r1.area();
        System.out.println(x);
        System.out.println(r2.area());

    }
}
