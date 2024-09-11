package Sesion_10_OOP_CONCEPTS;

public final class HightVisibilityAlarm extends Alarm {

    public HightVisibilityAlarm(String message) {
        super(message);
    }

    @Override
    public String getReport(boolean toUppercase) {
//        if (isActive() && !isSnoozing()) {
//            if (toUppercase)
//                return getMessage().toUpperCase() + "!";
//            else
//                return getMessage() + "!";
//        } else return "";

        String report = super.getReport(toUppercase);
        if (report.isEmpty())
            return report;
        else
            return report + "!";

    }

    public static void main(String... args) {
        HightVisibilityAlarm alarm = new HightVisibilityAlarm("Temperature is to high");
        alarm.turnOn();
        //  System.out.println(alarm.getReport(true));

        alarm.sendReport();
        alarm.turnOff();
        alarm.sendReport();
    }


}
