package binarySearch;


public class BinarySearch<T extends Comparable<T>> {

    public int search(T[] source, T item) {
        if (source == null || source.length < 0) {
            return -1;
        } else {
            return search(source, item, 0, source.length - 1);
        }
    }

    private int search(T[] source, T item, int start, int end) {

        if (start == end) {
            return item.compareTo(source[start]) == 0 ? start : -1;
        }
        else {
            int midPoint = start + ((end - start) / 2);
            int compareResult = item.compareTo(source[midPoint]);

            if (compareResult == 0) {
                return midPoint;
            }
            else if (compareResult < 0 && midPoint > start) {
                return search(source, item, start, midPoint - 1);
            }
            else if (compareResult > 0 && midPoint < end) {
                return search(source, item, midPoint + 1, end);
            }

            return -1;
        }
    }
}
