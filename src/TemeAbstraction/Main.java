package TemeAbstraction;

public class Main {
    public static void runParentExample() {
        Parent obj1 = new FirstSubClass();
        obj1.message();

        Parent obj2 = new FirstSubClass();
        obj2.message();
    }

    public static void main(String[] args) {
        System.out.println("\nRun Parent example!");
        runParentExample();
        System.out.println("\nRun Bank example!");
        runBankExample();
        System.out.println("Run Animal(Ani) example!");
        runAniExample();
        System.out.println("\nRun Marks example!");
        runMarksExample();
        System.out.println("\nRun Abstract example!");
        abstractClass();
        System.out.println("\nRun Shape example!");
    }

    public static void runBankExample() {
        Bank bankA = new BankA();
        System.out.println("Balance in Bank A: $" + bankA.getBalance());

        Bank bankB = new BankB();
        System.out.println("Balance in Bank B: $" + bankB.getBalance());

        Bank bankC = new BankC();
        System.out.println("Balance in Bank C: $" + bankC.getBalance());
    }

    public static void runAniExample() {
        Ani cat = new Cat();
        cat.cats();
        Ani dog = new Dog();
        dog.dogs();

    }

    public static void runMarksExample() {
        a studentA = new a(85, 90, 80);
        System.out.println("Percentage of Student A: " + studentA.getPercentage() + "%");

        b studentB = new b(75, 85, 90, 88);
        System.out.println("Percentage of Student B: " + studentB.getPercentage() + "%");
    }

    public static void abstractClass() {
        SubClass obj = new SubClass();
        obj.a_method();
        obj.normal_method();
    }

    public static void shapeClass() {
        Area area = new Area();
        double length = 5;
        double breadth = 3;
        double side = 4;
        double radius = 2;
        System.out.println("Area of Rectangle: " + area.rectangleArea(length, breadth));
        System.out.println("Area of Square: " + area.squareArea(side));
        System.out.println("Area of Circle: " + area.circleArea(radius));
    }

}
