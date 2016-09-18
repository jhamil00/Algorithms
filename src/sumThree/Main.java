package sumThree;


import binarySearch.BinarySearch;

public class Main {

    public static void main(String[] args) {

        Integer[] source = {-100, -90, -85, -50, -45, -20, -10, 5, 20, 30, 40, 50, 75, 95, 100 };

        BinarySearch<Integer> search = new BinarySearch();
        printSumZeros(source, search);
    }

    private static void printSumZeros(Integer[] source, BinarySearch<Integer> search) {

        int searchPosition = -1;
        for (int i = 0; i < source.length - 2; i++) {
            for (int j = i + 1; j < source.length - 1; j++) {

                searchPosition = search.search(source, -(source[i] + source[j]), j + 1);
                if (searchPosition != -1) {
                    System.out.printf("(%d, %d, %d)%n", source[i], source[j], source[searchPosition]);
                }
            }
        }

    }

}