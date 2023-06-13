package OOPS;

public class BicycleOBJECTdemo {
    public static void main(String[] args) {

        BicycleCLASS bike1=new BicycleCLASS( 10,20,30);
        BicycleCLASS bike2=new BicycleCLASS( 40,50,60);
//        Invoking methods of class bicycle on these objects
//        On Object "bike1"
        bike1.changeGear(5);
        bike1.setCadence(10);
        bike1.SpeedUp(50);
        bike1.appyBrakes(20);
//        printing the values
        bike1.printStates();
//        on object "bike2"
        bike2.changeGear(6);
        bike2.setCadence(20);
        bike2.SpeedUp(60);
        bike2.appyBrakes(30);
        bike2.printStates();
    }
}
