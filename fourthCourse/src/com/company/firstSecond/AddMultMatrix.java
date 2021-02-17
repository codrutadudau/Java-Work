package com.company.firstSecond;

import java.util.Arrays;

public class AddMultMatrix extends ReadFile {
    private static int r1 = 5, c1 = 5;
    private static int r2 = 5, c2 = 5;

    static int[][] addMatrix = new int[5][5];
    private static int[][] prodMatrix = new int[r1][c2];

    public static int[][] getAddMatrix() {
        return addMatrix;
    }

    public static int[][] getProdMatrix() {
        return prodMatrix;
    }

    public void addMatrix() {
        System.out.println();
        System.out.println("Matrix addition: ");
        for (int i = 0; i < ReadFile.getMyArray1().length; i++) {
            for (int j = 0; j < ReadFile.getMyArray2().length; j++) {
                addMatrix[i][j] = ReadFile.getMyArray1()[i][j] + ReadFile.getMyArray2()[i][j];
            }
        }
        for (int[] rc : addMatrix) {
            System.out.println(Arrays.toString(rc));
        }
    }

    public void multMatrix() {
        System.out.println();
        System.out.println("Matrix multiplication: ");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    prodMatrix[i][j] += ReadFile.getMyArray1()[i][k] * ReadFile.getMyArray2()[k][j];
                }
            }
        }
        for (int[] rc : prodMatrix) {
            System.out.println(Arrays.toString(rc));
        }
    }
}
