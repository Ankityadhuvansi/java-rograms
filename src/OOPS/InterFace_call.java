package OOPS;

public class InterFace_call {
    public static void main(String[] args) {
        AVON_Bicycle_Implement bike1= new AVON_Bicycle_Implement();
        bike1.changeGear(5);
        bike1.changeCadence(20);
        bike1.speedUp(100);
        bike1.applyBrakes(60);
        bike1.printStates();
    }
}
