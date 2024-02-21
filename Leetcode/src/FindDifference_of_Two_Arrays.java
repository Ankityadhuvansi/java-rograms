import java.util.*;

public class FindDifference_of_Two_Arrays {

        public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
            Set<Integer>Set=new HashSet<>();
            for(int num:nums1){
                Set.add(num);
            }
            for(int num:nums2){
                if(!Set.add(num)){
                    Set.remove(num);
                }
            }
            return Collections.singletonList(new ArrayList<Integer>(Set));
        }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 4, 6};
        System.out.println(findDifference(nums1,nums2));
    }

//    public static int mostWordsFound(String[] sentences) {
//        int maxLen=Integer.MIN_VALUE;
//        for(String str:sentences){
//            String[] string=str.split(" ");
//            System.out.println(Arrays.toString(string));
//            if(string.length>maxLen){
//
//                maxLen=string.length;
//            }
//        }
//        return maxLen;
//    }
//
//    public static void main(String[] args) {
//        String[] sentences = {"please wait", "continue to fight", "continue to win"};
//        System.out.println(mostWordsFound(sentences));
//    }
}
