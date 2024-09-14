package TemeAbstraction;

public class Main {
    public static void runParentExample() {
        Parent obj1 = new FirstSubClass();
        obj1.message();

        Parent obj2 = new FirstSubClass();
        obj2.message();
    }

    public static void main(String[] args) {
        System.out.println("\nRunning Parent Example!");
        runParentExample();
        System.out.println("\nRunning Bank Example!");
        runBankExample();
        System.out.println("Running Animal(Ani) Example!");
        runAniExample();
    }

    public static void runBankExample() {
        Bank bankA = new BankA();
        System.out.println("Balance in Bank A: $" + bankA.getBalance());

        Bank bankB = new BankB();
        System.out.println("Balance in Bank B: $" + bankB.getBalance());

        Bank bankC = new BankC();
        System.out.println("Balance in Bank C: $" + bankC.getBalance());
    }
    public static void runAniExample(){
        Ani cat = new Cat();
        cat.cats();
        Ani dog = new Dog();
        dog.dogs();

    }






}