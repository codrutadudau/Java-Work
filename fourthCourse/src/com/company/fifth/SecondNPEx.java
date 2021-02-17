package com.company.fifth;

public class SecondNPEx extends NPEx {
    public NPEx something;

    public void secondNPEXException() {
        try {
            something.nullPointerException();
        } catch (NullPointerException npe) {
            System.out.println("NullPointerException caught!");
        }
    }
}
