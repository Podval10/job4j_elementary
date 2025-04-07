package ru.job4j.condition;

public class PrimeNumber {
    public static int calc(int finish) {
        int calc = 0;
        for (int number = 2; number <= finish; number++) {
            if (CheckPrimeNumber.check(number)) {
                calc += 1;
            }
        }
        return calc;
    }
}
