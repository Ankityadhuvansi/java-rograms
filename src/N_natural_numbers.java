public class N_natural_numbers {
    static void natural(int n){
        if(n>0){
            natural(n-1);
            System.out.println(n+" ");
        }
    }

    public static void main(String[] args) {
        natural(20);
    }
}
