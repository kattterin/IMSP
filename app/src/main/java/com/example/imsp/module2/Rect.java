package com.example.imsp.module2;

public class Rect {
    private double height;
    private double width;

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double height) {
        if (height <= 0) {
            System.out.println("Error height");
            return;
        }
        this.height = height;
    }

    public void setWidth(double width) {
        if (width <= 0) {
            System.out.println("Error width");
            return;
        }
        this.width = width;
    }

    public double area() {
        return this.width * this.height;
    }

}
