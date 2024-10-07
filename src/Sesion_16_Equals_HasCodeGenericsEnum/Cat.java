package Sesion_16_Equals_HasCodeGenericsEnum;

public class Cat implements Animal {
    @Override
    public void sound() {
        System.out.println("miau miau");
    }

    @Override
    public String toString() {
        return "pisica face miau miau";
    }
}
