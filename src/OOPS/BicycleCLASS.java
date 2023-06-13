package OOPS;

public class BicycleCLASS {
    int gear=1;
    int speed=0;
    int cadence=0;

    public BicycleCLASS(int startCadence, int startSpeed, int startGear) {
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
    }
    void changeGear(int newVal){
        gear=newVal;
    }
    void SpeedUp(int incSpeed){
        speed+=incSpeed;
    }
    void setCadence(int newValue){
        cadence=newValue;
    }
    void appyBrakes(int newVal){
        speed-=newVal;
    }
    void printStates(){
        System.out.println("Gear:"+gear+" Speed:"+speed+" Cadence:"+cadence);
    }
}
