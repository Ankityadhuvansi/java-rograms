public class Set_Reset_A_Bit {
    public static void main(String[] args) {
        int n=1010110;
        int targetBit=4;
        System.out.println(set_A_bit(n,targetBit));
    }
    static int set_A_bit(int n,int i){
        return n|(1<<(i-1));
    }
    static int Reset_A_bit(int n,int i){
        return n&((1<<(i-1)));
    }
}
