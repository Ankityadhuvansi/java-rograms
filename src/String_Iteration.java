import java.util.Scanner;

public class String_Iteration {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        stringIterate(str);
        String[] arr={"ankit","kumar","yadav"};
        stringArray_Iterate(arr);
        String[] details = {"7868190130M7522","5303914400F9211","9273338290F4010"};
        System.out.println(countSeniors(details));
    }
    static void stringIterate(String s){
        int n=s.length();
        for (int i = 0; i < n; i++) {
            System.out.println(s.charAt(i));
        }
    }
    static void stringArray_Iterate(String[] str){
        for (String s : str) {
            for (int j = 0; j < s.length(); j++) {
                System.out.println(s.charAt(j));
            }
        }
    }
    static int countSeniors(String[] details) {
        int count=0;

        for(String i:details){
            char str1= i.charAt(11);
            char str2=i.charAt(12);
            int str3=Integer.parseInt(String.valueOf(str1) + str2);

            if(str3>60){
                count++;
            }
        }
        return count;
    }
}
