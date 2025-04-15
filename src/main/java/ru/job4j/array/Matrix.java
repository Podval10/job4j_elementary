package ru.job4j.array;

import java.util.Arrays;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] table = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {

table[i][j]= (j+1)*(i+1);
            }
        }
//--------------------------------------
        for (int i = 0; i < size; i++) {
            System.out.println(Arrays.toString(table[i]));
        }

//------------------------------------------
        return table;
    }

    public static void main(String[] args) {
         multiple(3);
    }
}

