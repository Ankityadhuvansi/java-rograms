public class maxelementArray {
    public static long maxElement(long arr[],long n){
        long max=Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        long[] arr={1,2,3};
        System.out.println(maxElement(arr,3));
    }
}
