package WEB_TECH_LAB;

public class Static_Var {
    private static int count=11;

    public static void printCount(int num){
        count+=num;
        System.out.println(count);
    }
}
class Main{
    public static void main(String[] args) {
        Static_Var.printCount(12);
    }
}
