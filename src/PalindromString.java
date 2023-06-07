import java.util.*;
public class PalindromString {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("enter the String:");
        String str=in.nextLine();
        boolean ans= palindrom_String(str);
        System.out.println(ans);
    }
    public static boolean palindrom_String(String s) {
        String str=s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false; // Characters don't match, not a palindrome
            }
            i++;
            j--;
        }
        return true;
    }
}
