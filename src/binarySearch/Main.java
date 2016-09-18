package binarySearch;


public class Main {

    public static void main(String[] args) {

        Integer[] sortedArray1 = {1, 2, 3, 4, 10, 11, 700, 804, 903 };
        Integer[] sortedArray2 = {-5, 0, 5, 10, 15, 20 };

        BinarySearch<Integer> intSearcher = new BinarySearch();

        System.out.println(intSearcher.search(sortedArray1, 1));
        System.out.println(intSearcher.search(sortedArray1, 903));
        System.out.println(intSearcher.search(sortedArray1, 5));

        System.out.println(intSearcher.search(sortedArray2, -5));
        System.out.println(intSearcher.search(sortedArray2, 10));
        System.out.println(intSearcher.search(sortedArray2, 20));
        System.out.println(intSearcher.search(sortedArray2, 22));
    }

}
