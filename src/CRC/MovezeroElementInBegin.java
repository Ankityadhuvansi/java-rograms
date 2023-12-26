package CRC;

import java.util.Arrays;

public class MovezeroElementInBegin {
    public static int[] Begin(int[] arr){
        Arrays.sort(arr);
        return arr;
    }

    public static void main(String[] args) {
        int[] arr1={0,1,0,1,0,0};
        System.out.println(Arrays.toString(Begin(arr1)));
    }
}
