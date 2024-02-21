class swap {
//    public static double findMaxAverage(int[] nums, int k) {
//        int max=Integer.MIN_VALUE;
//
//        for(int i=0;i<=nums.length-k;i++){
//            int j=i;
//            int sum=0;
//            int n=k;
//            while(n-->0){
//                sum+=nums[j];
//                j++;
//            }
//            if(max<sum){
//                max=sum;
//            }
//        }
//        return (double) max /k;
//    }
    public static double findMaxAverage(int[] nums, int k) {
    double currentMax=0;
    double max=0;
    for (int i = 0; i < k; i++) {
        currentMax+=nums[i];
    }
    max=currentMax;
    for (int j = k; j <nums.length ; j++) {
        currentMax=currentMax+nums[j]-nums[j-k];
        max=Math.max(currentMax,max);
    }
    return  max/k;
}

    public static void main(String[] args) {
        int[] arr={1,12,-5,-6,50,3};
        System.out.println(findMaxAverage(arr,4));
    }
}