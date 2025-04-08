package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages= new short[10];
        String [] names = new String[4];
        float[] prices = new float[40];
        System.out.println("Размер массива равен: " + ages.length);
        System.out.println("Размер массива равен: " + names.length);
        System.out.println("Размер массива равен: " + prices.length);
        names[0] = "Andrey";
        names[1] = "Nikolaevich";
        names[2] = "Vahid";
        names[3] = "Wugi";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);

    }


    }

