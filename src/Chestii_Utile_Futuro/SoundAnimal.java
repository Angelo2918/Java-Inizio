// Sounds Animal
class Anima {
    // sound method for the Animal class
    public void sound() {
        System.out.println("/nAnimal makes sounds");
    }
}

// Dog.java
class Dogs extends Anima {
    // sound method for the Dog class
    @Override
    public void sound() {
        System.out.println("bark");
    }
}

// Cat.java
class Cats extends Anima {
    // sound method for the Cat class
    @Override
    public void sound() {
        System.out.println("meow");
    }
}

// Wolf.java
class Wolfs extends Anima {
    // sound method for the Wolf class
    @Override
    public void sound() {
        System.out.println("howl");
    }
}

// TestAnimal.java
public class SoundAnimal {
    public static void main(String[] args) {
        // Create instances of each animal
        Anima dogs = new Dogs();
        Anima cats = new Cats();
        Anima wolfs = new Wolfs();

        // Call the sound method for each animal
        dogs.sound();  // Prints "bark"
        cats.sound();  // Prints "meow"
        wolfs.sound(); // Prints "howl"
    }
}