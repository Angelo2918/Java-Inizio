package Sesion_10_OOP_CONCEPTS;

import java.time.LocalDateTime;

public sealed class Alarm permits HightVisibilityAlarm, PriotizeAlarm {
    private boolean active;
    private final String message;
    private LocalDateTime snoozeUntil;


    //    Alarm(){
//        message="asdasf";
//    }

    public Alarm(String message) {
        this.message = message;
        stopSnoozing();
        //  this(message,false);
    }

    public void setSnoozeUntil(LocalDateTime snoozeUntil) {
        this.snoozeUntil = snoozeUntil;
    }

    public LocalDateTime getSnoozeUntil() {
        return snoozeUntil;
    }

    public boolean isActive() {
        return active;
    }

    public boolean getActive() {
        return active;
    }


    public void snoze() {
        if (active)
            snoozeUntil = LocalDateTime.now().plusSeconds(5);

    }

    public boolean isSnoozing() {
        return snoozeUntil.isAfter(LocalDateTime.now());
    }


    public void stopSnoozing() {
        snoozeUntil = LocalDateTime.now().minusSeconds(1);
    }


//  public Alarm(String message,boolean active) {
//        this .message = message;
//        this.active = active;
//    }

    public void turnOn() {
        active = true;
    }

    public final void turnOff() {
        active = false;
        stopSnoozing();
    }

    public String getReport() {

        return getReport(false);

    }

    public String getReport(boolean toUppercase) {
        if (active && !isSnoozing()) {
            if (toUppercase)
                return message.toUpperCase();
            else
                return message;
        } else return "";
    }

    public void sendReport() {
        System.out.println(getReport(true));
    }

}
