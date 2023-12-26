//public class BestTimeToSELLandBUY {
//        public static int maxProfit(int[] prices) {
//            int buy=Integer.MAX_VALUE;
//            int sell=0;
//            int k = 0,m = 0;
//            for(int i=0;i<prices.length;i++){
//                if(prices[i]<buy){
//                    buy=prices[i];
//                    m=i;
//                }
//                if(prices[i]>sell){
//                    sell=prices[i];
//                    k=i;
//                }
//            }
//            System.out.println(sell);
//            System.out.println(buy);
//            System.out.println(m);
//            System.out.println(k);
//            if(m<k){
//
//                int profit =sell-buy;
//                return profit;
//            }
//            return 0;
//        }
//
//    public static void main(String[] args) {
//        int[] arr={7,1,5,3,6,4};
//        System.out.println(maxProfit(arr));
//    }
//}
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left=0;
        int right= numbers.length-1;
        while(left<right){
            int sum=numbers[left]+numbers[right];
            if(sum==target){return new int[]{left+1,right+1};}
            else if(sum<target){left--;}
            else{right--;}
        }
        return new int[]{0,0};
    }
}