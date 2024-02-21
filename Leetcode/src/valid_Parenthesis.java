import java.util.Stack;

public class valid_Parenthesis {
    public boolean isValid(String s) {
        Stack<Character> characters = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                characters.push(ch);
            } else {
                if (characters.isEmpty()) {
                    return false;
                }
                char top = characters.peek();
                if ((ch == ')' && top == '(') || (ch == '}' && top == '{') || (ch == ']' && top == '[')) {
                    characters.pop();
                } else {
                    return false;
                }
            }
        }
        return characters.isEmpty();
    }

}
