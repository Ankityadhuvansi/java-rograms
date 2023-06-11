// In a given array eve no appears twice and one number exist only once find the number?
public class Array_using_bits {
    public static void main(String[] args) {
     int[] arr={2,3,4,1,2,1,3,6,4};
        System.out.println(singleExisting_number(arr));
    }
    static int singleExisting_number(int[] arr){
        int unique=0;
        for (int n:arr) {
         unique^=n;                  //XOR b/w unique and n
        }
        return unique;
    }
}
