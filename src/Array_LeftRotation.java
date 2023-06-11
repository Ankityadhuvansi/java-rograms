import java.util.Arrays;

public class Array_LeftRotation {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int d=2;
        int[] ans=array_left(arr,d);
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