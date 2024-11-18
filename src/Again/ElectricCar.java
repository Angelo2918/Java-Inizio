package Again;

public class ElectricCar extends Car {
    public int batteryCapacity;
    public int range;

    public ElectricCar(String make, String model, int year, int batteryCapacity, int range) {
        super(make, model, year);
        this.batteryCapacity = batteryCapacity;
        this.range = range;
    }

    public void charge() {
        System.out.println("Electric car is charging");
    }
}
