import java.util.Scanner;

public class Bits_manupulation {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        Odd_Even(n);
    }
    static void Odd_Even(int n){
        if((n&1)==1){
            System.out.println("odd");
        }else {
            System.out.println("even");
        }
    }

}
