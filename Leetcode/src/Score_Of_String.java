public class Score_Of_String {
    public static int scoreOfString(String s) {
        int sum=0;
        for(int i=1; i< s.length();i++){
            int result=Math.abs((int)s.charAt(i-1)-(int)s.charAt(i));
            sum+=result;
        }
        return sum;
    }
    public static int  findPermutationDifference(String s, String t) {
        int sum=0;
        for(int i=0; i<s.length(); i++){
            int result= Math.abs(i - t.indexOf(s.charAt(i)));
            sum+=result;
        }
        return sum;
    }


    public static void main(String[] args) {
//        System.out.println(scoreOfString("hello"));
        System.out.println(findPermutationDifference("abc","bac"));
    }
}
