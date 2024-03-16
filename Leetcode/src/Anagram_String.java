import java.util.Arrays;

public class Anagram_String {
    public boolean isAnagram(String s, String t) {
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        String str = "Hello Baeldung!";
        str=str.trim();
        str=str.replaceAll("//s+"," ");
        String[] string=str.split(" ");
        System.out.println(Arrays.toString(string));
        StringBuilder string1=new StringBuilder();
        for (int j = string.length-1; j >=0 ; j--) {
            string1.append(string[j]);
            if(j>0){
                string1.append(" ");
            }
        }
        System.out.println(string1);
//        for (int i = 0; i < str.length(); i++) {
//            char c = str.charAt(i);
//            System.out.print(c);
//        }
//        return string1.toString();
    }
}
