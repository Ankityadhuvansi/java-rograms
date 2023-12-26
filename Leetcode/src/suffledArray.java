import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class suffledArray {
//    public static int[] shuffle(int[] nums, int n) {
//        int[] ans=new int[nums.length];
//        ArrayList<Boolean>list=new ArrayList<Boolean>();
//        int k=n;
//        for(int i=0;i<n;i++){
//            ans[i]=nums[i];
//            if(k<nums.length){
//                ans[k]=nums[k];
//                k++;
//            }
//        }
//        return ans;
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean>list=new ArrayList<Boolean>();
        int n=candies.length;
        int maxcandies=0;
        for (int i = 0; i < n; i++) {
            maxcandies=Math.max(maxcandies,candies[i]);
        }
        for (int candy : candies) {
            int sum = 0;
            sum = candy + extraCandies;
            if (sum >=maxcandies) {
                list.add(true);
            } else {
                list.add(false);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr={2,5,1,3,4,7};
        List<Boolean> ans=kidsWithCandies(arr,3);
        System.out.println(ans);
    }
}