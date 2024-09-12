package Chestii_Utile_Futuro;

class Animalele {
    public void sound() {
        System.out.println("Sounds of animals...");
    }
}

class Pisici extends Animalele {
    @Override
    public void sound() {
        System.out.println("Meow");
    }
}
class Catei extends Animalele{
    public void sound() {
        System.out.println("Woof");
    }
}

class Bufnita extends Animalele {
    @Override
    public void sound() {
        System.out.println("Hoot");
    }
}

class Leu extends Animalele{
    @Override
    public void sound() {
        System.out.println("Roar");
    }
}

public class Animale {
    public static void main(String args[]) {

        Animalele pisici = new Pisici();
        Animalele catei = new Catei();
        Animalele bufnita = new Bufnita();
        Animalele leu = new Leu();

        pisici.sound();//pisici make Meow
        catei.sound();//catei make Woof
        bufnita.sound();//bufnita make Hoot
        leu.sound();//leu make Roar
    }
}