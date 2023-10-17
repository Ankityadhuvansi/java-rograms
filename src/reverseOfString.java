import java.util.Arrays;

public class reverseOfString {
    public static String reveseString(String str){
        int n=str.length();
        String[] arr=new String[n];
        for (int i = 0; i < n; i++) {
            arr[i]= String.valueOf(str.charAt(i));
        }
        int start=0;
        int end= arr.length-1;
        while(start<end) {
            String temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        String Str=String.join("",arr);
        return Str;
    }

    public static void main(String[] args) {
        String str="hello";
        String s=reveseString(str);
        System.out.println(s);
    }
}
