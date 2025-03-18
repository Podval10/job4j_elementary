package ru.job4j.calculator;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        int deistvie1= x2-x1;
        int deistvie2= y2-y1;
        int operaishon1= deistvie1*deistvie1;
        int operaishion2= deistvie2*deistvie2;
        int deistvie3 = operaishon1+operaishion2;
        double result=Math.sqrt(deistvie3);
        return result;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
    }
    }

