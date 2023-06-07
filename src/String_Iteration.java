import java.util.Scanner;

public class String_Iteration {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
//        String str=in.nextLine();
//        stringIterate(str);
        String[] arr={"ankit","kumar","yadav"};
        stringArray_Iterate(arr);
    }
    static void stringIterate(String s){
        int n=s.length();
        for (int i = 0; i < n; i++) {
            System.out.println(s.charAt(i));
        }
    }
    static void stringArray_Iterate(String[] str){
        int n=str.length;
        for (String s : str) {
            for (int j = 0; j < s.length(); j++) {
                System.out.println(s.charAt(j));
            }
        }
    }
}
