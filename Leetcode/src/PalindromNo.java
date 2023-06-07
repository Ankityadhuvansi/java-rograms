public class PalindromNo {
    public static void main(String[] args) {
        int n=121;
        System.out.println(isPalindrome(n));
    }
    static boolean isPalindrome(int x){
        int pal=0;
        int temp=x;
        if(x<0){
            return false;
        }else{
            while(x>0){
                int rem=x%10;
                x/=10;
                pal=pal*10+rem;
            }
        }
        return pal ==temp;
    }
}
