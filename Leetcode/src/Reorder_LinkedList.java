public class Reorder_LinkedList {
    public static int lengthOfLastWord(String s) {
        String[] strings= s.split(" ");
        return strings[strings.length-1].length();
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("hello world"));
    }
}
