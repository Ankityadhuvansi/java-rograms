//import java.util.*;
//
//public class aaaaaaaaaaa {
//    //    public static void arraylisting(){
////        ArrayList<Integer> list=new ArrayList<>();
////        HashSet<Integer> set=new HashSet<>();
////        int[] arr=new int[10];
////        list.add(2);
////        list.add(1);
////        list.add(3);
////        System.out.println(Arrays.toString(list.toArray()));
////        list.contains(list.indexOf(1));
////        for (int i = 0; i < list.size(); i++) {
////            System.out.println(list.get(i));
////        }
////    }
////    public static void main(String[] args) {
////        int n = 12;
////        int k = 3;
//////            System.out.println(kthFactor(n, k)); // Output: 3
////        System.out.println(pivotInteger(8));
////    }
//
//    public static int kthFactor(int n, int k) {
//        List<Integer> list = new ArrayList<>();
//        fact(n, 1, list);
//
//        if (k <= list.size()) {
//            return list.get(k - 1);
//        }
//
//        return -1;
//    }
//
//    public static void fact(int n, int i, List<Integer> list) {
//        if (i <= n) {
//            if (n % i == 0) {
//                list.add(i);
//            }
//            fact(n, i + 1, list);
//        }
//    }
//
//    public static int pivotInteger(int n) {
//        int[] list = new int[n];
//        for (int i = 0; i < n; i++) {
//            list[i] = i + 1;
//        }
//        int sum1 = 0, sum2 = 0;
//
//        for (int i = 0; i < n; i++) {
//            sum2 += list[i];
//        }
//
//        for (int i = 0; i < n; i++) {
//            sum2 -= list[i];
//            if (sum1 == sum2) {
//                return list[i];
//            }
//            sum1 += list[i];
//        }
//
//        return -1;
//    }
//
//
//        public static String whoOwesMore(int X1, int R1, int X2, int R2) {
//            double interest_A = (X1 * R1) / 100.0;
//            double interest_B = (X2 * R2) / 100.0;
//
//            if (interest_A > interest_B) {
//                return "A";
//            } else if (interest_B > interest_A) {
//                return "B";
//            } else {
//                return "EQUAL";
//            }
//        }
//
//        public static void main(String[] args) {
//            int X1 = 2942200;
//            int R1 = 89;
//            int X2 = 213224085;
//            int R2 = 37;
//            System.out.println(whoOwesMore(X1, R1, X2, R2)); // Output: EQUAL
//        }
//
//}
public class aaaaaaaaaaa {

    public static void main(String[] args) {
        System.out.println("hello world ");
    }
}

