package com.example.imsp.module2;

public class Terminator extends Robot{
    protected String gun;

    public Terminator(String name, int hp, int armor) {
        super(name, hp, armor);
        this.gun = "scissors";
    }

    @Override
    public  void printInfo() {
        super.printInfo();
        System.out.println("gun: " + gun);

    }

    public int getArmor() {
        return armor;
    }

    public String getGun() {
        return gun;
    }

    public void setGun(String gun) {
        this.gun = gun;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }
}
