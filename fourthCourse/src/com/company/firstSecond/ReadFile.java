package com.company.firstSecond;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

class ReadFile {
    private static int[][] myArray1 = new int[5][5];
    private static int[][] myArray2 = new int[5][5];

    public static int[][] getMyArray1() {
        return myArray1;
    }

    public static int[][] getMyArray2() {
        return myArray2;
    }

    public void readFile() throws IOException {
        FileInputStream file1 = new FileInputStream(new File("D:\\Work\\Probleme\\fourthCourse\\src\\com\\company\\firstSecond\\txt\\firstMatrix.txt"));
        FileInputStream file2 = new FileInputStream(new File("D:\\Work\\Probleme\\fourthCourse\\src\\com\\company\\firstSecond\\txt\\secondMatrix.txt"));
        Scanner s1 = new Scanner(file1);
        Scanner s2 = new Scanner(file2);
        System.out.println("First Matrix: ");
        while (s1.hasNextLine()) {
            for (int i = 0; i < myArray1.length; i++) {
                String[] line = s1.nextLine().trim().split(" ");
                for (int j = 0; j < line.length; j++) {
                    myArray1[i][j] = Integer.parseInt(line[j]);
                }
            }
        }
        for (int[] rc : myArray1) {
            System.out.println(Arrays.toString(rc));
        }
        System.out.println("Second Matrix: ");
        while (s2.hasNextLine()) {
            for (int i = 0; i < myArray2.length; i++) {
                String[] line = s2.nextLine().trim().split(" ");
                for (int j = 0; j < line.length; j++) {
                    myArray2[i][j] = Integer.parseInt(line[j]);
                }
            }
        }
        for (int[] rc : myArray2) {
            System.out.println(Arrays.toString(rc));
        }
    }
}



