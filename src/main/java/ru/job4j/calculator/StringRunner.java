package ru.job4j.calculator;

public class StringRunner {

        public static void main(String[] args) {
            String idea = "I like Java!";
            System.out.println(idea);
            idea = idea + " But I am a newbie. ";
            int year = 2022;
            idea = idea + year;
            System.out.println(idea);


             idea="I like Java!";
            System.out.println(idea);
            idea+="But I am a newbie.";

            idea+= 2022;
            System.out.println(idea);

            int first = 2;
            int second = 10;
            int result = first + second;
            System.out.println("Result sum: " + result);
            result = second - first;
            System.out.println("Result subtract: " + result);
            result = first * second;
            System.out.println("Result multiply: " + result);
            result = second / first;
            System.out.println("Result divide: " + result);


             first = 2;
             second = 10;
            first += second;
            System.out.println("Result sum: " + first);
            first = 2;
            second -= first;
            System.out.println("Result subtract: " + second);
            second = 10;
            first *= second;
            System.out.println("Result multiply: " + first);
            first = 2;
            second /= first;
            System.out.println("Result divide: " + second);


            first = first + 1;
            first += 1;
            first++;

            int i = 100;
            System.out.println("Use increment: " + i++);
            System.out.println("After increment: " + i);
            System.out.println("Use decrement: " + i--);
            System.out.println("After decrement: " + i);
            System.out.println("./////////////////////////");
            System.out.println("Use increment: " + ++i);
            System.out.println("After increment: " + i);
            System.out.println("Use decrement: " + --i);
            System.out.println("After decrement: " + i);
        }
    }

