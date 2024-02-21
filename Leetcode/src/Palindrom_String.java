public class Palindrom_String {
    public static boolean isPalindrome(String s) {

        String string=s.toLowerCase().replaceAll("\\s+","").replaceAll("[^a-zA-Z0-9]", "");
//        String string=s.replaceAll("\\s+","").replaceAll("[^a-zA-Z0-9]", "");
        int start=0;
        int end=string.length()-1;
        while (start<=end){
            if(string.charAt(start)!=string.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
}
