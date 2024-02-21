import java.util.HashSet;
import java.util.Set;

class Happy_Number {
    public static boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();
        return isHappy(n, seen);
    }

    private static boolean isHappy(int n, Set<Integer> seen) {
        if (n == 1) {
            return true;
        }
        if (!seen.contains(n)) {
            return false;
        }
        seen.add(n);
        int newN = (int) Math.pow(n / 10, 2) + (int) Math.pow(n % 10, 2);
        return isHappy(newN, seen);
    }

    public static void main(String[] args) {
//        System.out.println(isHappy(19));
//        System.out.println(Math.abs(1-3));
        System.out.println(2&3);
    }
}