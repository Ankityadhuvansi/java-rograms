public class NumberLineJumps {
    public static String jumps(int x1, int v1, int x2, int v2){
        if (v1 == v2) {
            return x1 == x2 ? "YES" : "NO";
        } else {
            int distanceDiff = x1 - x2;
            int velocityDiff = v2 - v1;
            if (distanceDiff % velocityDiff == 0 && distanceDiff / velocityDiff >= 0) {
                return "YES";
            } else {
                return "NO";
            }
        }
    }
}
