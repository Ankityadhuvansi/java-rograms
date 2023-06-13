import java.util.Arrays;

public class Matrix {
    public static void main(String[] args) {
        int[][] grid = {{3, 2, 1},
                {1, 7, 6},
                {2, 7, 7}};
        matrix(grid);
    }

    static void matrix(int[][] arr) {
//        System.out.println(arr.length);
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int[] arr1 = new int[arr[i].length];
            for (int j = 0; j < arr[i].length; j++) {
                arr1[j] = arr[j][i];
            }
//            System.out.println(Arrays.toString(arr1));
            for (int[] row : arr) {
                if (Arrays.equals(row, arr1)) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
