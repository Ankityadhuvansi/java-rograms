import java.util.HashSet;
import java.util.Set;

public class GCD_OfString {
    public static String gcdOfStrings(String str1, String str2) {
        StringBuilder str=new StringBuilder();
        int n=Math.min(str1.length(),str2.length());
        for (int i = 0; i < n; i++) {
            if(str1.charAt(i)==str2.charAt(i)){
                str.append(str2.charAt(i));
            }
            else{
                return "";
            }
        }
        return str.toString();
    }

    public static void main(String[] args) {
//        String str1 = "LEET", str2 = "CODE";
        String str1 = "ABABAB", str2 = "ABAB";
        System.out.println(gcdOfStrings(str1,str2));
    }
}
