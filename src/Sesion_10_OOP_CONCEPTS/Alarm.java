package Sesion_10_OOP_CONCEPTS;

import java.time.LocalDateTime;

public class Alarm {
    private boolean active;
    final String message;
    private LocalDateTime snoozeUntil;


    //    Alarm(){
//        message="asdasf";
//    }

    Alarm(String message) {
        this.message = message;
        stopSnoozing();
        //  this(message,false);
    }

    void setSnoozeUntil(LocalDateTime snoozeUntil) {
        this.snoozeUntil = snoozeUntil;
    }

    LocalDateTime getSnoozeUntil() {
        return snoozeUntil;
    }

    boolean getActive() {
        return active;
    }


    void snoze() {
        if (active)
            snoozeUntil = LocalDateTime.now().plusSeconds(5);

    }

    boolean isSnoozing() {
        return snoozeUntil.isAfter(LocalDateTime.now());
    }


    void stopSnoozing() {
        snoozeUntil = LocalDateTime.now().minusSeconds(1);
    }


//    Alarm(String message,boolean active) {
//        this .message = message;
//        this.active = active;
//    }

    void turnOn() {
        active = true;
    }

    void turnOff() {
        active = false;
        stopSnoozing();
    }

    String getReport() {

        return getReport(false);

    }

    String getReport(boolean toUppercase) {
        if (active && !isSnoozing()) {
            if (toUppercase)
                return message.toUpperCase();
            else
                return message;
        } else return "";
    }

    void sendReport() {
        System.out.println(getReport(true));
    }

}
