package com.company.thirdFourth;

import java.io.IOException;

public class ClassC {
    public static void display() throws IOException{
        throw new IOException();
    }

    public static void getCustomException() throws CustomException{
        throw new CustomException("IO problem!");
    }
}
