import java.util.Stack;

public class RemoveAllAdjacentDuplicatesInString {
    public static String removeDuplicates(String s) {
        Stack<Character> stack=new Stack<>();
        for(char ch:s.toCharArray()){
            if (!stack.isEmpty() && stack.peek()==ch){
                stack.pop();
            }else {
                stack.push(ch);
            }
        }
        StringBuilder stringbuilder=new StringBuilder();
        for(char c:stack){
            stringbuilder.append(c);
        }
        return stringbuilder.toString();
    }

    public static void main(String[] args) {
        String s = "abbaca";
        System.out.println(removeDuplicates(s));
    }
}
