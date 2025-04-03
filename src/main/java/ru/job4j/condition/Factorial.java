package ru.job4j.condition;

public class Factorial {
    public static int calculate(int number) {
        int result = 1;
        for (int index = 1; index <= number; index++) {
            result *=  index;
        }
        return result;


    }


}