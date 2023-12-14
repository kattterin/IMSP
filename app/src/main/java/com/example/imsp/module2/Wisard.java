package com.example.imsp.module2;

public class Wisard extends Unit {
    private int mana = 50;

    public Wisard(String name, int hp, int mana) {
        super(name, hp);
        this.mana = mana;
    }

    @Override
    public void attack(Unit enemy) {
        System.out.println(this.getName() + " attack " + enemy.getName());
        enemy.setHp(enemy.getHp() - 10);
        this.mana -= 5;

    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }
}
