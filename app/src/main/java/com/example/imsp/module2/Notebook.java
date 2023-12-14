package com.example.imsp.module2;

public class Notebook {
    private String name;
    private int d;
    private String color;

    public Notebook(String name, int d, String color) {
        this.color = color;
        this.name = name;
        this.d = d;
        }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "Name: " + this.name + "\nDiagonal: "  + this.d + "\nColor: " + this.color;
    }

}
