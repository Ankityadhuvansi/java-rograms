import java.util.Arrays;

public class sumof1Darray {
        public static int[] runningSum(int[] nums) {
            int[] ans=new int[nums.length];
            for(int i=0;i<nums.length;i++){
                for(int j=0;j<=i;j++){
                    ans[i]+=nums[j];
                }
            }
            return ans;
        }

    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        System.out.println(Arrays.toString(runningSum(arr)));
    }
}
