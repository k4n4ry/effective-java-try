package com.company.no02;

public class No02 {

    //builder pattern
    public static void exec() {
        NutritionFacts cocaCola = new NutritionFacts.Builder(240, 8)
                .calories(100)
                .sodium(35)
                .carbohydrate(27)
                 .build();

    }
}
