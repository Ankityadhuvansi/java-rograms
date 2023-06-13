class Valid_parentheses {
    public static void main(String[] args) {
        System.out.println(isValid("()"));
    }
    static boolean isValid(String s) {
        if(s.contentEquals("(){}[]")){
            return true;
        }
//        if (s.contains("()")) {
//            return true;
//        } else if (s.contains("{}")) {
//            return true;
//        } else if (s.contains("[]")) {
//            return true;
//        }
        return false;
    }
}