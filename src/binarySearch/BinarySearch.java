package binarySearch;


public class BinarySearch<T extends Comparable<T>> {

    public int search(T[] source, T item) {
        return search(source, item, 0);
    }

    public int search(T[] source, T item, int start) {
        if (source == null || source.length < start) {
            return -1;
        } else {
            return search(source, item, start, source.length - 1);
        }
    }

    public int search(T[] source, T item, int start, int end) {

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
