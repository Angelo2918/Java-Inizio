package Again;

public class SpeedBoat extends Boat {
    public int maxSpeed;
    public String engineType;

    public SpeedBoat(double length, double weight, int maxSpeed, String engineType) {
        super(length, weight);
        this.maxSpeed = maxSpeed;
        this.engineType = engineType;
    }

    public void turboBoost() {
        System.out.println("Turbo boost activated");
    }
}
