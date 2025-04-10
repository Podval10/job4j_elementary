package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] postfix) {
        boolean result = true;


        if (word[word.length - 1] != postfix[postfix.length - 1]) {
            result = false;

        }

        return result;
    }
}
