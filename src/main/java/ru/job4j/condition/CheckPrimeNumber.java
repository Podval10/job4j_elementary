package ru.job4j.condition;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        if(number==1){
            return false;
        }
        boolean check = true;
        for (int index = 2; index < number; index++) {

            if ((number % index ) == 0) {
                check = false;
                break;


            }
        }            return check;

    }


}










