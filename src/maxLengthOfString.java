public class maxLengthOfString {
    public static int maxlength(String s){
        String[] arr= s.split(" ");
//        int max=0;
//        for (int i = 0; i < arr.length; i++) {
//            if(max< arr[i].length()){
//                max=arr[i].length();
//            }
//        }
        String S=arr[arr.length-1];
//        return max;
        return S.length();
    }

    public static void main(String[] args) {
        String S="Hello World";
        System.out.println(maxlength(S));
    }
}
