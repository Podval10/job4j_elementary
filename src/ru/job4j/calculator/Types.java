package ru.job4j.calculator;

public class Types {
    public static void main(String[] args) {
        // 1 выражение
        long l = 129;
        byte b = (byte) l;
        int i= (int) l;
        System.out.println("Вывод в консоль значения после преобразования с потерей: " + b);
        System.out.println("Вывод в консоль значения после преобразования без потерь : " + i);

        // 2 выражение
        float f = 12358.7f;
        int j = 45981;
        short result = (short) (f + j);
        int result2= (int) (f+j);
        System.out.println("Результат вычисления с потерей : " + result);
        System.out.println("Результат вычисления без потерь: " + result2);

        // 3 выражение
        char c = 45000;
        float a = c;

        System.out.println("Результат вычисления без потерь : " +a);


    }
}
