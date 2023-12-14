package com.example.imsp.module2;

public class Robot extends Unit{
    protected int armor = 100;

    public Robot(String name, int hp, int armor) {
        super(name, hp);
        this.armor = armor;
    }

    @Override
    public  void printInfo() {
        super.printInfo();
        System.out.println("Armor: " + armor);

    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }
}
