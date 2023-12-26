import java.util.HashSet;

public class unionArray {
    public static int unionofArray(int[] arr,int[] arr1,int m,int n){
        HashSet<Integer> arr2=new HashSet<>();
        for (int i = 0; i < m; i++) {
            arr2.add(arr[i]);
        }
        for (int i = 0; i < n; i++) {
            arr2.add(arr1[i]);
        }
        return arr2.size();
    }

    public static void main(String[] args) {
        int[] arr={1,2,34,5,6};
        int[] arr1={1,3,6,4,9,8};
        System.out.println(unionofArray(arr,arr1,5,6));
    }
}
