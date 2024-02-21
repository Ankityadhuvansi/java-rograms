package String;

public class Basics {
    public static void main(String[] args) {
        String Name="Ankit";
        String Name1="Ankit";
        //Here Name And Name1 are pointing to same Object "Ankit"
        //To create two object which points to same object but as different given below
        String Name2=new String("Ankit");
        String Name3=new String("Ankit");

        System.out.println(Name==Name1);
        // This will return true, this show that Name and Name1 are pointing to the Same object and "==" operator compare for equality of reference variable as they are pointing to the same object
        System.out.println(Name2==Name3);
        // This will return false as they are pointing to two different objects
        System.out.println(Name2.equals(Name3));
        // Here it will return true because the .equals() checks for equality this means this will compare the contents of object
    }
}
