package com.example.imsp.module2;

public class Unit{
    protected String name;
    protected int hp = 100;

    public final static int hands = 2;

    public Unit(String name, int hp){
        this.hp = hp;
        this.name = name;
    }



    public void printInfo() {
        System.out.println("name: " + this.name);
        System.out.println("Hp: " + this.hp);
    }

    public void attack(Unit enemy) {
        System.out.println(this.name + " attack " + enemy.name);
        enemy.setHp(enemy.getHp() - 10);
    }







    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public int getHp() {return hp;}

    public void setHp(int hp) {this.hp = hp;}

}
