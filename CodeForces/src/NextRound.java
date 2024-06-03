import java.util.Scanner;

public class NextRound {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int i=0;
        int[] arr =new int[n];
        while(n-->0){
            arr[i++] = scanner.nextInt();
        }
        int count=0;
        for (int num: arr) {
            if (num >= arr[k-1] && num > 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
