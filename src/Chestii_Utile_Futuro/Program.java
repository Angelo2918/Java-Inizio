package Chestii_Utile_Futuro;

class Animal {
    public void makeSound() {
        System.out.println("Grr...");
    }
}
class Cat extends Animal {
    public void makeSound() {
        System.out.println("Meow");
    }
}
class Dog extends Animal {
    public void makeSound() {
        System.out.println("Woof");
    }
}

class Owl extends Animal{

    public void makeSound(){
        System.out.println("Hoot");
    }
}

class Lion extends Animal{

    public void makeSound(){
        System.out.println("Roar");
    }
}

class Program {
    public static void main(String args[ ]) {
        Animal a = new Dog();
        Animal b = new Cat();
        Animal c = new Owl();
        Animal d = new Lion();

        a.makeSound();
        b.makeSound();
        c.makeSound();
        d.makeSound();
    }
}