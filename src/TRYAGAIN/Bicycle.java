package TRYAGAIN;

public class Bicycle {
    public int speed;
    public int gear;

    public Bicycle(int speed, int gear) {
        this.speed = speed;
        this.gear = gear;
    }

    public void changeGear(int newGear) {
        gear = newGear;
    }

    public void speedUp(int increment) {
        speed += increment;
    }

    public void applyBrake(int decrement) {
        speed -= decrement;
    }
}
