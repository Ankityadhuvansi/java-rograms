import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SalesByMatch {
    public static int sockMerchant(int n, List<Integer> ar) {
        Set<Integer> socks = new HashSet<>();
        int count = 0;

        for (int i = 0; i < n; i++) {
            int sock = ar.get(i);
            if (socks.contains(sock)) {
                count++;
                socks.remove(sock);
            } else {
                socks.add(sock);
            }
        }

        return count;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(2);
        System.out.println(sockMerchant(7, list)); // Output should be 2
        System.out.println('X'-1);
    }
}
