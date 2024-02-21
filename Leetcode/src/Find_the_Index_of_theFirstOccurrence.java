public class Find_the_Index_of_theFirstOccurrence {
    public static int strStr(String haystack, String needle) {
        if(haystack.contains(needle)){
            int i=0;
            return haystack.indexOf(needle);
        }
        return -1;
    }

    public static void main(String[] args) {
        String haystack = "mississippi", needle = "issip";
        System.out.println(strStr(haystack,needle));
    }
}
