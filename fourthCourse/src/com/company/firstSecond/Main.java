package com.company.firstSecond;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        ReadFile rf = new ReadFile();
        AddMultMatrix aam = new AddMultMatrix();
        WriteToFile wtf = new WriteToFile();

        rf.readFile();
        try{
        aam.addMatrix();
        aam.multMatrix();}catch(ArrayIndexOutOfBoundsException ie){
            ie.printStackTrace();
        }
        wtf.writeFile("D:\\Work\\Probleme\\fourthCourse\\src\\com\\company\\firstSecond\\txt\\addMult.txt");
    }
}


