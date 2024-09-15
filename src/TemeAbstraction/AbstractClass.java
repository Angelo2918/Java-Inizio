package TemeAbstraction;

abstract class AbstractClass {
    public AbstractClass() {
        System.out.println("This is constructor of abstract class!");
    }

    abstract void a_method();

    void normal_method() {
        System.out.println("This is a normal method of abstract class!");
    }
}

class SubClass extends AbstractClass {
    void a_method() {
        System.out.println("This is abstract method!");
    }
}
