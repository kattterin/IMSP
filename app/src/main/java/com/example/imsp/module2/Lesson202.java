package com.example.imsp.module2;

public class Lesson202 {
    public static void main(String[] args) {
        Unit u1 = new Unit("name", 120);
        System.out.println("HP " + u1.getName() + ": " + u1.getHp());
        u1.setName("Skif");
        u1.setHp(150);
        System.out.println("HP " + u1.getName() + ": " + u1.getHp());

        Wisard w1 = new Wisard("wisard", 231, 22);
        w1.setName("Dumbledore");
        System.out.println("MANA " + w1.getName() + ": " + w1.getMana());

        Robot r1 = new Robot("robot", 222, 22);
        r1.setName("R2D2");
        r1.setArmor(77);
        System.out.println("ARMOR " + r1.getName() + ": " + r1.getArmor());

        Terminator t1 = new Terminator("ter", 2244, 123);

//        Unit[] enemies = {w1, r1, w1, r1};
//        for(Unit next: enemies) {
//            if (next instanceof Wisard) {
//                Wisard w = (Wisard) next;
//                System.out.println(w.getMana());
//            }
//            next.attack(u1);
//        }
//        for (int i = 0; i < enemies.length; i++) {
//            enemies[i].attack(u1);
//
//        }
//        System.out.println("HP "+ u1.getName() + ": " + u1.getHp());
//        System.out.println("MANA "  + w1.getName() + ": " + w1.getMana());
        r1.printInfo();
        System.out.println("\n");
        t1.printInfo();
        System.out.println("\n");
        t1.setGun("knife");

        t1.printInfo();

        System.out.println("\n");
        Unit[] units = new Unit[5];
        for (int i = 0; i < 5; i++) {
            int type = (int) Math.round(Math.random() * 3);
            switch (type) {
                case 0:
                    units[i] = new Robot("R3D3", 100, 123);
                    break;
                case 1:
                    units[i] = new Unit("Кто-то", 100);
                    break;
                case 2:
                    units[i] = new Terminator("200R3D3", 1002, 123000);
                    break;
                case 3:
                    units[i] = new Wisard("Dumbledore", 100, 222);
                    break;
            }

            Unit u = units[i];
            u.printInfo();
            System.out.println("\n");
        }


    }
}
