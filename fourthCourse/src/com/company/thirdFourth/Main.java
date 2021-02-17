package com.company.thirdFourth;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            ClassA a = new ClassA();
            a.callB();
        } catch (IOException ioe) {
            StackTraceElement[] stackTrace = ioe.getStackTrace();
            for (int i = 0; i < stackTrace.length; i++) {
                System.out.println(" ");
                System.out.println("Exception thrown from " +
                        stackTrace[i].getMethodName() + " in class " +
                        stackTrace[i].getClassName() + " on line " +
                        stackTrace[i].getLineNumber() + " of file " +
                        stackTrace[i].getFileName());
            }
        }

        System.out.println(" ");

        try {
            ClassC c = new ClassC();
            c.getCustomException();
        } catch (CustomException cEx) {
            System.out.println(cEx.getMessage());
        }
    }
}
