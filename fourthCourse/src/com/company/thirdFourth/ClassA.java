package com.company.thirdFourth;

import java.io.IOException;

public class ClassA {
    public static void callB() throws IOException {
        ClassB.callC();
    }
}
