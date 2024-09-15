package TRYAGAIN;

public class Main {
    public static void main(String[] args) {
        Bicycle bike = new Bicycle(10, 1);
        bike.speedUp(5);
        bike.changeGear(2);
        bike.applyBrake(2);
        System.out.println("Bicycle speed: " + bike.speed + ", gear: " + bike.gear);
        MountainBike mountainBike = new MountainBike(15, 3, "Off-road", "Full");
        mountainBike.speedUp(10);
        mountainBike.adjustSuspension("Soft");
        System.out.println("MountainBike speed: " + mountainBike.speed + ", gear: " + mountainBike.gear + ", tire type: " + mountainBike.tireType + ", suspension: " + mountainBike.suspension);


        Car car = new Car("Toyota", "Corolla", 2020);
        car.start();
        car.accelerate();
        car.stop();
        System.out.println("Car make: " + car.make + ", model: " + car.model + ", year: " + car.year);

        ElectricCar electricCar = new ElectricCar("Tesla", "Model S", 2021, 100, 400);
        electricCar.start();
        electricCar.charge();
        electricCar.accelerate();
        electricCar.stop();
        System.out.println("ElectricCar make: " + electricCar.make + ", model: " + electricCar.model + ", year: " + electricCar.year + ", battery capacity: " + electricCar.batteryCapacity + ", range: " + electricCar.range);

        Tesla tesla = new Tesla("Tesla", "Model X", 2022, 100, 350, "v10.2");
        tesla.start();
        tesla.enableAutopilot();
        tesla.accelerate();
        tesla.stop();
        System.out.println("Tesla make: " + tesla.make + ", model: " + tesla.model + ", year: " + tesla.year + ", battery capacity: " + tesla.batteryCapacity + ", range: " + tesla.range + ", autopilot version: " + tesla.autopilotVersion);
        Boat boat = new Boat(30.5, 5000);
        boat.sail();
        System.out.println("Boat length: " + boat.length + ", weight: " + boat.weight);

        SpeedBoat speedBoat = new SpeedBoat(25.0, 3000, 80, "V8");
        speedBoat.sail();
        speedBoat.turboBoost();
        System.out.println("SpeedBoat length: " + speedBoat.length + ", weight: " + speedBoat.weight + ", max speed: " + speedBoat.maxSpeed + ", engine type: " + speedBoat.engineType);

        FishingBoat fishingBoat = new FishingBoat(20.0, 4000, 1000, "Gillnet");
        fishingBoat.sail();
        fishingBoat.castNet();
        System.out.println("FishingBoat length: " + fishingBoat.length + ", weight: " + fishingBoat.weight + ", fish capacity: " + fishingBoat.fishCapacity + ", type of net: " + fishingBoat.typeOfNet);
    }
}







