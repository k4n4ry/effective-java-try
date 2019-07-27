package com.company.no03;

public class Elvis {
//    //pattern 1
//    public static final Elvis INSTANCE = new Elvis();
//    private Elvis(){}

    //pattern 2
    private static final Elvis INSTANCE = new Elvis();
    private Elvis(){}
    public static Elvis getInstance() {return INSTANCE;}

    public void doSomething() {
        System.out.println("I am only Elvis .");
    }
}
