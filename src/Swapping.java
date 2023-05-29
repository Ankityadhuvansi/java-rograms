import java.util.Arrays;

public class Swapping {
    public static void main(String[] args) {
        int[] arr={1,4,7,543,89,3566,754,6,43,24,67,45,3,45,67};
        int end=arr.length-1;
        swaap(arr,0,end);
    }
    static void swaap( int arr[],int start,int end)
    {
        while(start<end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
