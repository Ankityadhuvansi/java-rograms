package CRC;

import java.util.Arrays;

public class Peak_Element {
    public static  int countPeak(int[] arr){
        if(arr.length<3){
            Arrays.sort(arr);
            return arr[arr.length-1];
        }
        int count=0;
        for (int i = 1; i < arr.length-1; i++) {

            if(arr[i-1]<arr[i] && arr[i]>arr[i+1]){
                count++;
            }
        }
        return count=count>0?count:-1;
    }
    public static void main(String[] args) {
        int[] arr={1};
        System.out.println(countPeak(arr));
    }
}
