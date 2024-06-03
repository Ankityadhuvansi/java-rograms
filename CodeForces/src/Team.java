import java.util.Scanner;

public class Team {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n=scanner.nextInt();
        int count=0;
        while(n-->0){
            int k=0;
            for (int i = 0; i < 3; i++) {
                int x= scanner.nextInt();
                if (x==1){
                    k++;
                }
            }
            if(k>=2){
                count++;
            }
        }
        System.out.println(count);
    }
}
