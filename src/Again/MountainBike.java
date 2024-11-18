package Again;

public class MountainBike extends Bicycle {
    public String tireType;
    public String suspension;

    public MountainBike(int speed, int gear, String tireType, String suspension) {
        super(speed, gear);
        this.tireType = tireType;
        this.suspension = suspension;
    }

    public void adjustSuspension(String newSuspension) {
        suspension = newSuspension;
    }
}

