package recursion;

public class count_Number_of_digit_ONE {
    public static int countOne(int n,int num,int count){
        if(n==0){
            return count;
        }
        int rem=num  % 10;
        if (rem == 1) {
            count++;
        }
        return countOne(n-1,num/10,count);
    }
}
