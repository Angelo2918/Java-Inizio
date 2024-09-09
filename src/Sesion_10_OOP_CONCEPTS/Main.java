package Sesion_10_OOP_CONCEPTS;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        //System.out.println("\nOOP CONCEPTS");

        Alarm alarm = new Alarm("La fica e tropo calda!");
        // System.out.println(alarm.active);
        alarm.turnOn();

        alarm.snoze();
        //    System.out.println("----");
        //   alarm.sendReport();
        //  Thread.sleep(6000);
        //   System.out.println(alarm.active);
        alarm.sendReport();


    }
}
