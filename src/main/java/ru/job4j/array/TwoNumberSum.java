package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int i = 0;
        int j = 1;
        int[] temp = {};
        while (i < array.length-1) {
            if (array[i] + array[j] == target) {
                temp = new int[]{i, j};
                break;
            }

            if (j == array.length - 1) {
                i++;
                j = i + 1;
            }

            j++;
        }

        return temp;
    }
}




