import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 5};
        int[] arr1 = {2, 3, 5, 6};
        System.out.println(Arrays.toString(intersection(arr, arr1)));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        int len = Math.min(nums1.length, nums2.length);
        int[] arr = new int[len];
        int i = 0;
        for (int ele1 : nums1) {
            for (int ele2 : nums2) {
                if (ele1 == ele2) {
                    arr[i] = ele1;
                    i++;
                }
            }
        }
        return arr;
    }
}