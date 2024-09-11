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

class Lion extends Animal {
    public Lion(String name, int age) {
        super(name, age);
    }

    public String makeSound() {
        return "Roar";
    }
}

class Tiger extends Animal {
    public Tiger(String name, int age) {
        super(name, age);
    }

    public String makeSound() {
        return "Growl";
    }
}

class Elephant extends Animal {
    public Elephant(String name, int age) {
        super(name, age);
    }

    public String makeSound() {
        return "Trumpet";
    }
}

public class Main {
    public static void main(String[] args) {
        Animal lion = new Lion("Simba", 3);
        Animal tiger = new Tiger("Rajah", 4);
        Animal elephant = new Elephant("Dumbo", 5);

        System.out.println(lion.getName() + " is a " + lion.getClass().getSimpleName() + " and says " + lion.makeSound());
        System.out.println(tiger.getName() + " is a " + tiger.getClass().getSimpleName() + " and says " + tiger.makeSound());
        System.out.println(elephant.getName() + " is a " + elephant.getClass().getSimpleName() + " and says " + elephant.makeSound());

        lion.setAge(4);
        System.out.println(lion.getName() + " is now " + lion.getAge() + " years old.");
    }
}