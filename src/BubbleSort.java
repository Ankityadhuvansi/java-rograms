import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={3,45,6,43,36,78,99,100};
        bubblesort(arr);
    }
    static void bubblesort(int arr[])
    {
        for (int i = 0; i <arr.length-1; i++) {
            for (int j = 1; j <arr.length-i-1 ; j++) {
                if(arr[j-1]>arr[j])
                {
                    int temp= arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
