import java.util.Arrays;
import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int[][] arr1= new int[5][3];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j <arr1[i].length ; j++) {
                arr1[i][j]=input.nextInt();
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(Arrays.toString(arr1[i]));
        }
    }
}
