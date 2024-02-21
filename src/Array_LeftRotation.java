import java.util.Arrays;

public class Array_LeftRotation {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int d=2;
        int[] ans=array_right_rotation(arr,d);
        System.out.println(Arrays.toString(ans));
    }
    static int[] array_left(int[] arr,int n) {
        int i = 0;
        while (i < n) {
            int temp = arr[0];
            for (int j = 0; j < arr.length-1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[arr.length - 1] = temp;
            i++;
        }
        return arr;
    }
    public static int[] array_right_rotation(int[]nums, int k){
        int n = nums.length;

        // Handle cases where k is greater than the array length
        k = k % n;

        reverse(nums, 0, n - 1);         // Reverse the entire array
        reverse(nums, 0, k - 1);         // Reverse the first k elements
        reverse(nums, k, n - 1);         // Reverse the remaining elements
        return nums;
    }

// Method to reverse a portion of an array
private static void reverse(int[] nums, int start, int end) {
    while (start < end) {
        // Swap elements at start and end indices
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;

        start++;
        end--;
    }
}
}
//This is for array list
//    int i=0;
//    while(i++<d){
//        int temp=arr.get(0);
//        for (int j = 0; j < arr.size()-1; j++) {
//        arr.set(j, arr.get(j+1));
//        }
//        arr.set(arr.size()-1, temp);
//        }
//        return arr;