package Sesion_10_OOP_CONCEPTS;

public non-sealed class PriotizeAlarm extends Alarm {
    private int priority;

    public PriotizeAlarm(String message, int priority) {
        super(message);
        this.priority = priority;
    }


    public int getPriority() {
        return priority;
    }

    public static void main(String... args) {
        PriotizeAlarm alarm = new PriotizeAlarm("Temperature is to high", 3);
        System.out.println(alarm.getPriority());

    }

}
