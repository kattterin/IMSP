package com.example.imsp.module2;

public class Fraction {
    private int numerator;
    private int denomirator;

    public Fraction(int numerator) {
        this(numerator, 1);
//        return this;
    }

    public Fraction(int numerator, int denomirator) {
        if (numerator < 0 && denomirator < 0 || numerator > 0 && denomirator < 0) {
            denomirator *= -1;
            numerator *= -1;
        }

        this.numerator = numerator;
        if (denomirator != 0) {
            this.denomirator = denomirator;
        } else {
            System.out.println("error in denomirator");
        }

        this.normalization();
    }

    public static int gcd(int a, int b) {
        int x = 1;
        a = Math.abs(a);
        b = Math.abs(b);
        while (a != 0 && b != 0) {
            if (a > b) {
                a %= b;
            } else {
                b %= a;
            }
        }
        x = a + b;
        return x;
    }

    public void normalization() {
        int gcd = gcd(this.numerator, this.denomirator);
        this.numerator /= gcd;
        this.denomirator /= gcd;

    }

    public Fraction add(Fraction f) {
        int n = this.numerator * f.denomirator + f.numerator * this.denomirator;
        int d = this.denomirator * f.denomirator;

        return new Fraction(n, d);
    }

    public Fraction mulp(Fraction f) {
        int n = this.numerator * f.numerator;
        int d = this.denomirator * f.denomirator;

        return new Fraction(n, d);
    }

    public Fraction divi(Fraction f) {
        f = new Fraction(f.denomirator, f.numerator);
        return this.mulp(f);
    }

    public Fraction sub(Fraction f) {
        f = new Fraction(-1 * f.numerator, f.denomirator);
        return this.add(f);
    }


    public int getNumerator() {
        return numerator;
    }

    public int getDenomirator() {
        return denomirator;
    }

    public String toString() {
        return this.numerator + "/" + this.denomirator;
    }


}
