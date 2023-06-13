package OOPS;

public class MountainBike extends Bicycle {

    // the MountainBike subclass has
    // one field
    public int seatHeight;

    // the MountainBike subclass has
    // one constructor
    public MountainBike(int startHeight, int startCadence, int startSpeed, int startGear) {
        super(startCadence, startSpeed, startGear);
        seatHeight = startHeight;
    }

    // the MountainBike subclass has
    // one method
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }
    public void printStates(){
        System.out.println("Gear:"+gear+" Speed:"+speed+" Cadence:"+cadence+" seatHeight:"+seatHeight);
    }

    public static void main(String[] args) {
        MountainBike bike=new MountainBike(5,10,10,1);
        bike.printStates();
    }
}
