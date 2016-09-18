package insertionSort;

public class InsertionSort {

    public static <T extends Comparable<T>> void sort(T[] arrayToSort) {

        if (arrayToSort == null || arrayToSort.length == 1) {
            return;
        }

        T swap;
        int j;
        for (int i = 0; i < arrayToSort.length ; i++) {
            swap = arrayToSort[i];
            j = i - 1;
            while (j >= 0
                    && arrayToSort[j].compareTo(swap) > 0) {
                arrayToSort[j + 1] = arrayToSort[j];
                j--;
            }
            arrayToSort[j + 1] = swap;
        }
    }
}
