package arraySpiral;


public class Main {

    public static void main(String[] args) {

        int[][] source1 = new int[][]{
                {1, 2, 3, 4, 5, 6, 7},
                {16, 17, 18, 19, 20, 21, 8},
                {15, 14, 13, 12, 11, 10, 9}
        };

        int[][] source2 = new int[][]{
                {1, 2, 3, 4 },
                {16, 17, 18, 5 },
                {15, 24, 19, 6 },
                {14, 23, 20, 7 },
                {13, 22, 21, 8 },
                {12, 11, 10, 9 }
        };

        int[][] source3 = new int[][]{
                {1},
                {2},
                {3},
                {4}
        };

        printSpiral(source1);
        System.out.println();
        printSpiral(source2);
        System.out.println();
        printSpiral(source3);

    }

    private static void printSpiral(int[][] source) {

        if (source.length > 0 && source[0].length > 0) {

            int left = 0;
            int top = 0;
            int right = source[0].length - 1;
            int bottom = source.length - 1;

            while (left <= right && top <= bottom) {

                for (int i = left; i <= right; i++) {
                    System.out.print(source[top][i] + " ");
                }
                top++;


                if (left <= right) {
                    for (int i = top; i <= bottom; i++) {
                        System.out.print((source[i][right]) + " ");
                    }
                    right--;
                }

                if (top <= bottom) {
                    for (int i = right; i >= left; i--) {
                        System.out.print((source[bottom][i]) + " ");
                    }
                    bottom--;
                }

                if (left <= right) {
                    for (int i = bottom; i >= top; i--) {
                        System.out.print((source[i][left]) + " ");
                    }
                    left++;
                }
            }
        }
    }
}
