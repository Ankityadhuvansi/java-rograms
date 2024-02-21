import java.util.HashSet;
import java.util.Stack;

public class Backspace_String {
    public static boolean backspaceCompare(String s, String t) {
        Stack<Character> stack = new Stack<>();
        Stack<Character> stack1 = new Stack<>();
        HashSet<Integer> set=new HashSet<>();
        for (char ch : s.toCharArray()) {
            if (ch == '#' && !stack.isEmpty()) {
                stack.pop();
            } else {
                if (ch != '#') {
                    stack.push(ch);
                };
            }
        }

        for (char ch : t.toCharArray()) {
            if (ch == '#' && !stack1.isEmpty()) {
                stack1.pop();
            } else {
                if (ch != '#') {
                    stack1.push(ch);
                }
            }
        }

        StringBuilder str = new StringBuilder();
        StringBuilder str1 = new StringBuilder();

        while (!stack.isEmpty()) {
            str.append(stack.pop());
        }

        while (!stack1.isEmpty()) {
            str1.append(stack1.pop());
        }
        System.out.println(str);
        System.out.println(str1);
        return str.toString().equals(str1.toString());
    }
}
