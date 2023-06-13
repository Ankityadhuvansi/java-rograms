import java.util.ArrayList;

class SubarrayWithGivenNum
{
    public static void main(String[] args) {
        int[][] arr={{1,2,3,4,5}};

        System.out.println(subarraySum(arr,5,12));
    }
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[][] arr, int n, int s)
    {
        // Your code here
        int sum;
        for(int i=1;i<=n;i++)
        {
            sum=arr[i][i];
            for(int j=0;j<=n;j++)
            {
                sum=sum+arr[i][j];
                if(sum==s){
                    System.out.printf("%d%d",i,j);
                }
            }
        }
        return null;
    }
}