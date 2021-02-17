package com.company.firstSecond;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class WriteToFile{
    public static void writeFile(String filename) throws IOException, ArrayIndexOutOfBoundsException{
        BufferedWriter output = new BufferedWriter(new FileWriter(filename, false));
        output.write("Add matrix: ");
        output.newLine();
        for (int i = 0; i < AddMultMatrix.getAddMatrix().length; i++) {
            output.write(Arrays.toString(AddMultMatrix.getAddMatrix()[i]) + " ");
            output.newLine();
        }
        output.write("Multiply matrix: ");
        output.newLine();
        for (int i = 0; i < AddMultMatrix.getProdMatrix().length; i++) {
            output.write(Arrays.toString(AddMultMatrix.getProdMatrix()[i]) + " ");
            output.newLine();
        }
        output.flush();
        output.close();
    }
}
