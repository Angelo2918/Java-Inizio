abstract class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract String makeSound();

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    public String makeSound() {
        return "Bark";
    }
}

class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    public String makeSound() {
        return "meow";
    }
}

class Wolf extends Animal {
    public Wolf(String name, int age) {
        super(name, age);
    }

    public String makeSound() {
        return "how";
    }
}

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("Lucy", 3);
        Animal cat = new Cat("Luna", 4);
        Animal wolf = new Wolf("Bursuc", 5);

        System.out.println(dog.getName() + " is a " + dog.getClass().getSimpleName() + " and says " + dog.makeSound());
        System.out.println(cat.getName() + " is a " + cat.getClass().getSimpleName() + " and says " + cat.makeSound());
        System.out.println(wolf.getName() + " is a " + wolf.getClass().getSimpleName() + " and says " + wolf.makeSound());

    }
}