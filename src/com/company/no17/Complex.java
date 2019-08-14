package com.company.no17;

public class Complex {
    private final double re;
    private final double im;

    public  Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double realPart() {return re;}
    public double imaginaryPart() {return  im;}

    public  Complex plus(Complex c) {
        return new Complex(re + c.re, im + c.im);
    }

    public  Complex minus(Complex c) {
        return new Complex(re - c.re, im - c.im);
    }
    @Override public boolean equals(Object o) {
        if ( o == this ) return true;
        if ( !(o instanceof  Complex)) return false;
        Complex c = (Complex)o;

        return Double.compare(c.re, re) == 0 && Double.compare(c.im, im) == 0;
    }

    @Override public int hashCode() {
        return 31 * Double.hashCode(re) + Double.hashCode(im);
    }

    @Override public String toString() {
        return "(" + re + " + " + im + "i)";
    }
}
