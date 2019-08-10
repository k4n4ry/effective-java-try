package com.company.no15;

import com.company.no10.CaseInsensitiveString;
import com.company.no10.PhoneNumber;

public class No15 {
    public static void exec() {
        System.out.println(StaticListTest.HOGE[0]);
        StaticListTest.HOGE[0] = 2;
        System.out.println(StaticListTest.HOGE[0]);

    }
}
