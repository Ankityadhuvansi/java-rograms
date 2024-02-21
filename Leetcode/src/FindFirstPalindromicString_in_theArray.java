public class FindFirstPalindromicString_in_theArray {
    public static String firstPalindrome(String[] words) {
        for (String str:words) {
            if(palindrome(str)){
                return str;
            }
        }
        return "";
    }
    public static boolean palindrome(String string){
        if (string==null || string.isEmpty()){
            return false;
        }
        for (int i = 0; i < string.length()/2; i++) {
            char start=string.charAt(i);
            char end=string.charAt(string.length()-1-i);
            if (start!=end){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] arr={"abc","car","ada","racecar","cool"};
        System.out.println(firstPalindrome(arr));
    }
}
