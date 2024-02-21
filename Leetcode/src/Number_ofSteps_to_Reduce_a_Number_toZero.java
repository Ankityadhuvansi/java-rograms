import java.util.LinkedList;
import java.util.Queue;

public class Number_ofSteps_to_Reduce_a_Number_toZero {
    public int numberOfSteps(int num) {
        return helper(num,0);

    }
    public int helper(int num,int c){
        if(num==0){
            return c;
        }
        if(num%2==0){
            return helper(num/2,c+1);
        }
        return helper(num-1,c+1);
    }


}
