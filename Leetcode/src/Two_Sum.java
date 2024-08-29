import java.util.Arrays;
import java.util.HashMap;

public class Two_Sum {
    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int i=0,j=n-1;
        while (i<n){
            int sum=nums[i]+nums[j];
            if(sum==target){
                return new int[]{i,j};
            }else if(sum<target){
                i++;
            }else {
                j--;
            }
        }
        return new int[]{};
    }

    public static String truncateSentence(String s, int k) {
        String[] str = s.split(" ");
        StringBuilder stringBuilder =new StringBuilder();
        for (int i = 0; i < k; i++) {
            stringBuilder.append(str[i]);
            if (i < k-1) {
                stringBuilder.append(" ");
            }
        }
        return stringBuilder.toString();
    }
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        System.out.println(Arrays.toString(twoSum(nums, 9)));
        System.out.println(truncateSentence("Hello how are you Contestant",4));
    }
}
