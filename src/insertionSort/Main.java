package insertionSort;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Integer[] sample = new Integer[10];
        Random random = new Random();

        for(int i = 0; i < sample.length; i++) {
            sample[i] = random.nextInt(100);
        }

        System.out.println(Arrays.toString(sample));
        InsertionSort.sort(sample);
        System.out.println(Arrays.toString(sample));
    }
}
