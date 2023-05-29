import java.util.Scanner;

//public class pattern {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j < n - i; j++) {
//                System.out.print(" ");
//            }
//            for (int k = 1; k <= i; k++) {
//                System.out.print("*"+" ");
//            }
//            System.out.println();
//        }
//    }
//}
class pattern
{
    public static void main(String[] args) {
        int n=5;
        for (int row = 1; row <=n; row++) {
            for (int col = 0; col < n-row; col++) {
                System.out.print(" ");
            }
            for (int k = 1; k <=row; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int row = 0; row <=n ; row++) {
            for (int col =1 ; col <row-1 ; col++) {
                System.out.print(" ");
            }
            for (int k = 1; k <=n-row ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}