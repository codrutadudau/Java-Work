package com.company.fifth;

public class AEx {
    private int a = 0;
    private int b = 5;
    private int c;

    public int arithmeticException() throws ArithmeticException {
        try {
            c = b / a;
        } catch (ArithmeticException ae) {
            System.out.println("You cannot divide by zero!");
        }
        return c;
    }
}
