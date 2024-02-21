package recursion;

public class linear_Search {
    public static boolean linear(int[] arr, int target,int index){
        if (index==arr.length-1 && arr[arr.length-1]==target){
            return false;
        }
        return arr[index]==target || linear(arr,target,index+1);
    }

    public static int returnIndex(int[] arr, int target,int index){
        if (index==-1){
            return -1;
        }
        if (arr[index]==target){
            return index;
        }
        return returnIndex(arr,target,index+1);
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        System.out.println(linear(arr,5,0));
        System.out.println(returnIndex(arr,7,0));
    }
}
