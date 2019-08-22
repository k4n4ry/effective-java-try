package com.company.no18;

import com.company.no15.StaticListTest;
import com.sun.tools.javac.util.List;

public class No18 {
    public static void exec() {
        InstrumentedHashSet<String> ih = new InstrumentedHashSet<>();
        ih.addAll(List.of("Snap", "Crackle", "Pop"));

        System.out.println(ih.getAddCount()); // 6がreturnされる！


    }
}
