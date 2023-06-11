public class Finding_ith_Bits {
    public static void main(String[] args) {
        int n=1010;
        int target=2;
        System.out.println(bitWhichBit(n,target));

    }
    static int bitWhichBit(int n,int i){
        return n&(1<<(i-1));
    }
}