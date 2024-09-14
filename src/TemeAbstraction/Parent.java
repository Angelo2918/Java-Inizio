package TemeAbstraction;

public abstract class Parent {
    abstract void message();
}

class FirstSubClass extends Parent {
    @Override
    void message() {
        System.out.println("This is first subclass!");
    }

    class SecondSubClass extends Parent {
        @Override
        void message() {
            System.out.println("This is second subclass!");
        }
    }
}

