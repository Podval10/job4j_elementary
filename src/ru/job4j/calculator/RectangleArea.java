package ru.job4j.calculator;

public class RectangleArea {
    public static double sguare(double p,double k){
double deistvie1=k+1;
double deistvie2= deistvie1*2;
double vusota= p/deistvie2;
double dlina= vusota*k;
double result=dlina*vusota;
//2* (k+1)
return result;
    }

    public static double sguareNew(double p,double k) {
        return p / (2 * (k + 1)) * k * (p / ((k + 1)*2));

    }


public static void main(String[] args){
        double result=RectangleArea.sguare(4,1);
        double result2=RectangleArea.sguare(6,2);

        System.out.println("p=4,k=1,s=1,real="+result);
        System.out.println("p=6,k=2, "+ result2);

        double result3=RectangleArea.sguareNew(6,2);
        System.out.println("p=4,k=1,s=1,real="+result3);
}
}
