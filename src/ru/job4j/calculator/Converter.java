package ru.job4j.calculator;

public class Converter {
    public static float rubleToEuro(float value) {
        float result = value / 70;
        return result;
    }
    public static float rubleToDollar(float value) {
        float result = value / 60;
        return result;
    }

    public static void main(String[] args) {
            float euro = Converter.rubleToEuro(140);
            System.out.println("140 rubles are " + euro + " euro.");
float dollar = Converter.rubleToDollar(150);
System.out.println("150 rubles are"+ dollar+ "dollar");
    }


    }

