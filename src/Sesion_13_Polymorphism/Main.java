package Sesion_13_Polymorphism;

public class Main {
    public static void main(String... args) {
        Animal myAnimal = new Dog();//upcasting ->Animal
        //myAnimal.makeSound();
        //   myAnimal.sleep();

        Dog myDog = (Dog) myAnimal;//downcasting Animal-> Dog
        myDog.makeSound(5);

        //   myDog.fetch();
        //   myDog.makeSound();
        doAnimalStuff(myDog);
        doAnimalStuff(new Cat());

        try {
            Cat myCat = (Cat) myAnimal;
            myCat.makeSound();
        } catch (ClassCastException ex) {
            System.out.println("Eroare.Nu putem face downcasting de la caine la pisica ");
        }
    }

    public static void doAnimalStuff(Animal animal) {
        animal.makeSound();
        if (animal instanceof Dog) {
            ((Dog) animal).fetch();
        } else if (animal instanceof Cat) {
            ((Cat) animal).scratch();
        }

    }


}


//clasa parinte/superclasa
class Animal {
    public void makeSound() {
        System.out.println("Generic sound");

    }


    public void sleep() {
        System.out.println("Sleep");
    }
}
//clasa derivata,(subclasa)

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cainele face hamham");
    }
    public void makeSound(int times) {
        for (int i = 0; i < times; i++)
            System.out.println("Cainele face ham ham");
    }

    public void fetch() {
        System.out.println("cainele aduce mingea");
    }
}

//clasa derivata/clasa copil/subclasa
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("pisica face miau miau");
    }
public void makeSound(int times){
}

    public void scratch() {
        System.out.println("pisica zgarie");
    }

}
