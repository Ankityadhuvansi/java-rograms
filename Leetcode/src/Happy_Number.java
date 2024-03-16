class Happy_Number {
    public static boolean isHappy(int n) {
        int sqSum=0;
        if(n<10){
            return n == 1 || n == 7;
        }else {
            while (n>0){
                int r=n%10;
                n/=10;
                sqSum+=r*r;
            }
        }

        return isHappy(sqSum);
    }

    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }
}