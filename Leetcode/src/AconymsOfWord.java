import java.util.ArrayList;
import java.util.List;

public class AconymsOfWord {
    public static void main(String[] args) {
        List<String> strings =new ArrayList<>();
        strings.add("alice");
        strings.add("bob");
        strings.add("charlie");
        System.out.println(isAcronym(strings,"abc"));
    }
    public static boolean isAcronym(List<String>words,String s) {
        if(words.size() != s.length()){
            return false;
        }
        for (int i = 0; i < words.size(); i++) {
            if(words.get(i).charAt(0) != s.charAt(i)){
                return false;
            }
        }
        return true;
    }

}
