import java.util.*;
class Median_of_Two_arrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int c=nums1.length+nums2.length;
        int[] nums3=new int[c];
        int count=0;
        for(int ele:nums1){
            nums3[count]=ele;
            count++;
        }
        for(int ele:nums2){
            nums3[count++]=ele;
        }
        Arrays.sort(nums3);
        int start=0;
        int end=nums3.length-1;
        int num=0;
        for(int i=0;i<=end;i++)
        {
            num++;
        }
        if(num%2==0){
            int mid=start+(end-start)/2;
            double median=(double)(nums3[mid]+nums3[mid+1])/2;
            return median;
        }else{
            int mid=start+(end-start)/2;
            double median=nums3[mid];
            return median;
        }
    }
}