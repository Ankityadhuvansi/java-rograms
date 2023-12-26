package CRC;

import java.util.Arrays;

public class arrayElementDEL {
    public static int[] Delete(int[] arr, int pos){
        if(arr.length<=1){
            System.out.println("no deletion");
        }
        for (int i = pos; i < arr.length-1 ; i++) {
            arr[i]=arr[i+1];
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(Delete(arr,3)));

    }
}
