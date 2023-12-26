import java.util.Arrays;
import java.util.HashSet;

class removeElementArray {
    public static int removeDuplicates(int[] nums) {
        HashSet<Integer> list=new HashSet<Integer>();
        for (int num : nums) {
            list.add(num);
        }
        Integer[] arr=new Integer[list.size()];
        list.toArray(arr);
        System.out.println(Arrays.toString(arr));
        return arr.length;

    }

    public static void main(String[] args) {
        int [] arr={0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(arr));
    }
}