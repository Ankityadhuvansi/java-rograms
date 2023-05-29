import java.util.Scanner;

public class forloop2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        int mul=1;
        for (int n = 0; n <num; n++) {
            int rem = num%10;
            num=num/10;
            sum=sum*10+rem;
//            mul=mul*rem;
        }
        System.out.println("revese is:"+sum);
//        System.out.println("mul is:"+mul);
    }
}
