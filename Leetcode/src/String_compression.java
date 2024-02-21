import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class String_compression {
    public static int compress(char[] chars) {
        HashMap<Character,Integer> comp=new HashMap<>();
        for(char c:chars){
            comp.put(c ,comp.getOrDefault(c, 0) + 1);
        }
        try {
            ArrayList<String> list=new ArrayList<>((Collection) comp);
            System.out.println(list);
        }catch (Exception e){
            System.out.println(e);
        }

        return comp.size();
    }

    public static void main(String[] args) {
        char[] arr={'a','a','b','b','c','c','c'};
        System.out.println(compress(arr));
    }
}
