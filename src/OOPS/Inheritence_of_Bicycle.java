package OOPS;

class Inheritence_of_Bicycle extends BicycleCLASS{


        // the MountainBike subclass adds one field
        public int seatHeight;

        // the MountainBike subclass has one constructor
        public Inheritence_of_Bicycle(int startHeight,
                            int startCadence,
                            int startSpeed,
                            int startGear) {
            super(startCadence, startSpeed, startGear);

            seatHeight = startHeight;
        }

        // the MountainBike subclass adds one method
        public void setHeight(int newValue) {
            seatHeight = newValue;
        }

        public static void main(String[] args) {
            Inheritence_of_Bicycle mb=new Inheritence_of_Bicycle(10,20,30,40);
            mb.setHeight(50);
            mb.printStates();
        }
    }
