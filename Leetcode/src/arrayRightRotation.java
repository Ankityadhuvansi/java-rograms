public class arrayRightRotation {
    public void rotate(int[] nums, int k) {
        int i = 0;
        while (i < k) {
            int temp = nums[nums.length-1];
            for (int j = nums.length-1; j >0; j--) {
                nums[j] = nums[j-1];
            }
            nums[0] = temp;
            i++;
        }
    }
}
