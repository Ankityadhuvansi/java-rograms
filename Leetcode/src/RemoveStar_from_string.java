import java.util.Arrays;
import java.util.Stack;

class RemoveStar_from_string{
    public static String removeStars(String s) {
        Stack<String> star=new Stack<>();
        StringBuilder string=new StringBuilder();

        char[] arr=s.toCharArray();
        System.out.println(Arrays.toString(arr));
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]!='*'){
                star.push(String.valueOf(arr[i]));
            }
            else {
                star.pop();
            }
        }
        while (!star.isEmpty()){
            string.append(star.pop());
        }
        return new String(string.reverse());
    }

    public static void main(String[] args) {
        String s = "leet**cod*e";
        System.out.println(removeStars(s));
    }
}