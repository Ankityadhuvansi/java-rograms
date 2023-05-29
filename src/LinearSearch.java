import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
//        int[] arr={1,2,34,45,67,88,98};
//        int target=67;
//        int ans=linearSearch2(arr,target);
//        System.out.println(ans);
        int[][] arr1={{1,3,5},
                    {85,98,45},
                    {65,87,97}};
        int target1=97;
        int ans1[]=linearSaerchin2D(arr1,target1);
        System.out.println(Arrays.toString(ans1));
    }
    static int linearSearch(int arr[],int target)
    {
        if(arr.length==0)
        {
            return -1;
        }
        else{
            for(int start=0;start<arr.length;start++)
            {
                if(arr[start]==target)
                {
                    return start;
                }
            }
            return -1;
        }
    }
    static int linearSearch2(int arr[],int target)
    {
        int start=0;
        int end=arr.length-1;
        while(start<=end)
        {
            if(arr[start]==target)
            {
                return start;
            }
            start++;
        }
        return -1;
    }
    static int[] linearSaerchin2D(int[][] arr,int target)
    {
        if (arr.length != 0) {
            for (int row = 0; row < arr.length; row++) {
                for (int col = 0; col < arr[row].length; col++) {
                    if (arr[row][col] == target) {
                        return new int[]{row, col};
                    }
                }
            }
        }
        return new int[]{-1,-1};
    }
}
