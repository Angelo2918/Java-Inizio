package Again;

public class Tesla extends ElectricCar {
    public String autopilotVersion;

    public Tesla(String make, String model, int year, int batteryCapacity, int range, String autopilotVersion) {
        super(make, model, year, batteryCapacity, range);
        this.autopilotVersion = autopilotVersion;
    }

    public void enableAutopilot() {
        System.out.println("Autopilot is enabled");
    }
}
