package com.company.no10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;

public class No10 {
    public static void exec() {
        CaseInsensitiveString cis = new CaseInsensitiveString("Polish");
        String s = "polish";

        //CaseInsentiveStringのequalsは大文字小文字を無視した比較を行うため、trueが返却
        System.out.println(cis.equals(s));
        //Stringのequalsはそのまま比較するため、falseが返却→対称性が守られていない！
        System.out.println(s.equals(cis));
    }
}
