package Sesion_16_Equals_HasCodeGenericsEnum;


public class Printer<T extends Animal> {
    private T thingToPrint;

    public Printer(T thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public void print() {
        thingToPrint.sound();
        System.out.println(thingToPrint);
    }
}
