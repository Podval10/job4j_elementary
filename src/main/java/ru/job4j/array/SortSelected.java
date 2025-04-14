package ru.job4j.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int i=0;i< data.length;i++) {
            int min = MinDiapason.findMin(data,i, data.length - 1);
            int index = FindLoop.indexInRange(data, min,i, data.length - 1);


                data[index]=data[i];
                data[i]=min;

            System.out.println("текущий массив " + Arrays.toString(data));
            }

        return data;
    }
}
