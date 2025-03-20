package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short height) {
//        (рост в сантиметрах – 110) · 1,15
        double result = (height-100) * 1.15;
        return result;
    }
        public static  double womanWeight(short height) {
            double result = (height-110) * 1.15;
            return result;
        }
            public static void main(String[] args){
         short height = 186;
         double man = Fit.manWeight(height);
         short heightw= 156;
         double woman= Fit.womanWeight(heightw);
         System.out.println("man 186 is"+man);
         System.out.println("woman 156 is "+woman);
        }
    }

