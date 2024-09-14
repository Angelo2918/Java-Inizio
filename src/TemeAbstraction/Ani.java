package TemeAbstraction;

abstract class Ani {
    abstract void cats();

    abstract void dogs();
}

class Cat extends Ani {
    @Override
    void cats() {
        System.out.println("Cats meow");
    }

    @Override
    void dogs() {

    }
}


class Dog extends Ani {
    @Override
    void dogs() {
        System.out.println("Dogs bark");
    }

    @Override
    void cats() {

    }
}
