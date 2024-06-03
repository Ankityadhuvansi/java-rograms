//    Input
//        4
//        word
//        localization
//        internationalization
//        pneumonoultramicroscopicsilicovolcanoconiosis

//  Output
//        word
//        l10n
//        i18n
//        p43s


import java.util.Scanner;

public class A_Way_LongWords {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        while (n-->0){
            String s = scanner.nextLine();
            if(s.length()<=10){
                System.out.println(s);
            }else {
                System.out.println(LongWord(s));;
            }
        }
        scanner.close();
    }
    public  static String LongWord(String string){
        int n= string.length();
        return string.charAt(0)+String.valueOf(n-2)+string.charAt(n-1);
    }
}
