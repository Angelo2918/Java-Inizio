package TRYAGAIN;

public class FishingBoat extends Boat {
    public int fishCapacity;
    public String typeOfNet;

    public FishingBoat(double length, double weight, int fishCapacity, String typeOfNet) {
        super(length, weight);
        this.fishCapacity = fishCapacity;
        this.typeOfNet = typeOfNet;
    }

    public void castNet() {
        System.out.println("Casting the net");
    }
}
