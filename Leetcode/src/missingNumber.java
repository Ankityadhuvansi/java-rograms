import java.util.Arrays;

public class missingNumber {
    static int missingNU(int[] nums){
        int n=nums.length;
        int res=0;
        Arrays.sort(nums);
        for (int i = 0; i < n; i++) {
            if(i==nums[i]){
                continue;
            }
            res=i;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr={0,1,3};
        System.out.println(missingNU(arr));
    }
}
