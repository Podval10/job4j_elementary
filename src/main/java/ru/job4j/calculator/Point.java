package ru.job4j.calculator;


import static java.lang.Math.sqrt;
import static java.lang.Math.pow;
public class Point {

    private int x;

    private int y;

    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public double distance1(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double distance = a.distance1(b);
        System.out.println(distance);
    }

    public static double distance(int x1, int y1, int x2, int y2) {
        int deistvie1 = x2 - x1;
        int deistvie2 = y2 - y1;
        int operaishon1 = deistvie1 * deistvie1;
        int operaishion2 = deistvie2 * deistvie2;
        int deistvie3 = operaishon1 + operaishion2;
        double result = Math.sqrt(deistvie3);
        return result;
    }

//    public static void main(String[] args) {
//        double result = Point.distance(0, 0, 2, 0);
//        System.out.println("result (0, 0) to (2, 0) " + result);
//        double result2 = Point.distance(0, 0, -2, 0);
//        System.out.println("result2 (0,0) to (-2,0) "  + result2);
//        double result3 = Point.distance(3, 2, 5, 0);
//        System.out.println("result3 (3,2) to (5,0) "  + result3);
//    }
}

