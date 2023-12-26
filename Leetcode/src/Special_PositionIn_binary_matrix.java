public class Special_PositionIn_binary_matrix {
    //    public int numSpecial(int[][] mat) {
//        int count=0,k = Integer.MIN_VALUE,l=Integer.MIN_VALUE;
//        for (int i = 0; i < mat.length; i++) {
//            for (int j = 0; j < mat[i].length; j++) {
//                if(mat[i][j]==1){
//                    if(i!=k&&j!=l){
//                        count++;
//                        k=i;
//                        l=j;
//                    }
//                }
//            }
//        }
//        return count;
//    }
    public boolean isPowerOfTwo(int n) {
        int x = 0;
        int count = 0;


        return false;
    }

    public int power(int num) {
        if (num > 0) {
            return power(num - 1);
        }
        return 1;
    }

//    public static void main(String[] args) {
//        System.out.println(isPowerOfTwo);
//    }


    public static void removeDuplicates(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        removeDuplicates(arr);
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

}