import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FindDifference_of_Two_Arrays {

    public static int mostWordsFound(String[] sentences) {
        int maxLen=Integer.MIN_VALUE;
        for(String str:sentences){
            String[] string=str.split(" ");
            System.out.println(Arrays.toString(string));
            if(string.length>maxLen){

                maxLen=string.length;
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        String[] sentences = {"please wait", "continue to fight", "continue to win"};
        System.out.println(mostWordsFound(sentences));
    }
}
