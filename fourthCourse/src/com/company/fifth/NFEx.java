package com.company.fifth;

public class NFEx {
    private String someString = "alabala";
    private int result;

    public int npException() {
        try {
            result = Integer.parseInt(someString);
        } catch (NumberFormatException nfe) {
            System.out.println("NumberFormatException occurred!");
        }
        return result;
    }
}
