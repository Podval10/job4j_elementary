package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 0;
        double procent= percent/100;
        double dolg= amount;
        while (dolg>0 ) {

       dolg=     (dolg*procent+dolg)-salary;

            year+=1;



        }
        return year;
        }
    }
