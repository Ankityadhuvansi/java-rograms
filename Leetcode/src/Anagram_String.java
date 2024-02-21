import java.util.Arrays;

public class Anagram_String {
    public static boolean isAnagram(String s, String t) {
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }

//    public static void main(String[] args) {
//        String str = "Hello Baeldung!";
//        str=str.trim();
//        str=str.replaceAll("\\s+,"," ");
//        String[] string=str.split(" ");
//        System.out.println(Arrays.toString(string));
//        StringBuilder string1=new StringBuilder();
//        for (int j = string.length-1; j >=0 ; j--) {
//            string1.append(string[j]);
//            if(j>0){
//                string1.append(" ");
//            }
//        }
//        System.out.println(string1);
////        for (int i = 0; i < str.length(); i++) {
////            char c = str.charAt(i);
////            System.out.print(c);
////        }
////        return string1.toString();
//    }
public static void main(String[] args) {
    String word1 = "abc", word2 = "bca";
    System.out.println(closeStrings(word1,word2));
}
    public  static boolean closeStrings(String word1, String word2) {
        char[] word=word1.toCharArray();
        char[] words=word2.toCharArray();
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for (int i = 0; i < word1.length(); ++i) {
            System.out.println(freq1[word1.charAt(i) - 'a']++);
        }
//        int i = 0;
//        while (!Arrays.equals(words, word)) {
//            char temp = word[0];
//            for (int j = 0; j < word.length-1; j++) {
//                word[j] = word[j + 1];
//            }
//            word[word.length - 1] = temp;
//            i++;
//        }
        return Arrays.equals(words, word);
    }
}
