package com.company.fifth;

import java.io.*;

public class Main {
    public static void main(String[] args) throws ArithmeticException {
        AEx aex = new AEx();
        aex.arithmeticException();

        System.out.println(" ");

        NFEx nfex = new NFEx();
        nfex.npException();

        System.out.println(" ");

        SecondNPEx snpex = new SecondNPEx();
        snpex.secondNPEXException();

        System.out.println(" ");

        NsEx nsex = new NsEx();
        nsex.name = "Codruta";
        nsex.age = 25;
        try {
            FileOutputStream output = new FileOutputStream("file.txt");
            ObjectOutputStream obj = new ObjectOutputStream(output);
            obj.writeObject(nsex);
            obj.close();
            output.close();
            System.out.printf("Serialized data is saved in file.txt");
        } catch (NotSerializableException nse) {
            System.out.println("NotSerializableException caught!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
