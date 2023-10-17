import java.util.Arrays;

class kthElement
{
    public static void sort012(int[] a, int n)
    {
        // code here
        Arrays.sort(a);
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr={1,0,2,1,0};
        sort012(arr,5);
    }
}