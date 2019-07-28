package com.company.no05;

import com.company.no04.UtilityClass;

public class No05 {
    public static void exec() {
        //クラス内で下層クラスを固定してしまっているパターン
        Boolean b = SpellChecker.isValid("hoge");
        //DIにより、依存性を注入するパターン
        SpellCheckerDI scdi = new SpellCheckerDI("Japanese");
        Boolean b2 = scdi.isValid("fuga");
    }
}
