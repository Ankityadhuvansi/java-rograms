import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Distinct_K {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();

        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            if(!set.contains(str)){
                set.add(str);
            }else {
                set.remove(str);
            }
        }

        int count = set.size();
        String[] arr = set.toArray( new String[0]);
        int k = sc.nextInt();
        if (k > 0 && k <= count) {
            int index = 1;
            for (String str : set) {
                if (index == k) {
                    System.out.println(str);
                    return;
                }
                index++;
            }
        } else {
            // If k is out of bounds or count is 0 (no unique strings), print empty string
            System.out.println("");
        }
    }
}
