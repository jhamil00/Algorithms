package quickSort;

import java.util.Arrays;
import java.util.Random;
import java.lang.System;

public class Main {

    public static void main(String[] args) {

        Integer[] sample = new Integer[10000];
        Random random = new Random();

        for(int i = 0; i < sample.length; i++) {
            sample[i] = random.nextInt(5000);
        }

        System.out.println(Arrays.toString(sample));
        QuickSort sorter = new QuickSort();
        sorter.sortArray(sample);
        System.out.println(Arrays.toString(sample));
    }
}
