package ru.job4j.calculator;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return ru.job4j.Math.MathFunction.sum(first, second)
                + ru.job4j.Math.MathFunction.multiply(first, second);
    }
    public static double vuchetAndDelenie(double first, double second) {
        return ru.job4j.Math.MathFunction.vuchet(first, second)
                + ru.job4j.Math.MathFunction.delenie(first, second);
    }
    public static double itog(double first, double second) {
        return ru.job4j.Math.MathFunction.sum(first, second)
                + ru.job4j.Math.MathFunction.multiply(first, second)
                + ru.job4j.Math.MathFunction.vuchet(first, second)
                + ru.job4j.Math.MathFunction.delenie(first, second);
    }


        public static void main (String[] args){
            System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
            System.out.println("Результат расчета равен: " + vuchetAndDelenie(10, 20));
            System.out.println("Результат расчета равен: " + itog(10,20));
        }
    }
