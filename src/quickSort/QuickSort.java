package quickSort;

public class QuickSort<T extends Comparable<T>> {

    public void sortArray(T[] array) {
        if (array == null
            || array.length < 2) {
            return;
        }
        quickSort(array, 0, array.length - 1);
    }

    private void quickSort(T[] array, int left, int right) {
        if (left < right) {

            int position = partition(array, left, right);
            quickSort(array, left, position);
            quickSort(array, position + 1, right);
        }
    }

    private int partition(T[] array, int left, int right) {
        T pivot = getPivot(array, left, right);
        left--;
        right++;
        while (true) {

            do {
                left++;
            }
            while (array[left].compareTo(pivot) < 0);

            do {
                right--;
            }
            while (array[right].compareTo(pivot) > 0);

            if (left < right) {
                swap(array, left, right);
            }
            else {
                return right;
            }
        }
    }

    private T getPivot(T[] array, int left, int right) {
        if ((right - left) < 3) {
            return array[left];
        }
        else {
            T midElement = array[left + (right - left) / 2];

            if (array[left].compareTo(midElement) >= 0
                    && array[left].compareTo(array[right]) <= 0) {
                return array[left];
            }
            else if (array[right].compareTo(midElement) >= 0
                    && array[right].compareTo(array[left]) <= 0) {
                return array[right];
            }
            else {
                return midElement;
            }
        }
    }

    private void swap(T[] array, int position1, int position2) {
        T temp = array[position1];
        array[position1] = array[position2];
        array[position2] = temp;
    }

}
