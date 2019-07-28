package com.company.no05;

public class SpellCheckerDI {
    private final Object dictionary;

    public SpellCheckerDI(Object dictionary){
        this.dictionary = dictionary;
    }

    public boolean isValid(String word) {return true;}
}
