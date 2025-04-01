package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left> right? left: right;
        return result;


    }

    public static int min(int left, int right) {
        int result = left >  right? right : left;
        return result;


    }



    public static void main(String[] args) {
        int messege= Max.max(1,5);
        System.out.println(messege);
        int mesege= Max.max(5,6);
        System.out.println(mesege);

    int messege1= Max.min(1,5);
        System.out.println(messege1);


}


}
