package com.company.no03;

public class No03 {
    public static void exec() {
//        //pattern 1
//        Elvis ELVIS = Elvis.INSTANCE;

        //pattern 2
        Elvis ELVIS = Elvis.getInstance();

        //pattern 3
        ElvisEnum ELVIS2 = ElvisEnum.INSTANCE;

        ELVIS.doSomething();
        ELVIS2.doSomething();
    }
}
