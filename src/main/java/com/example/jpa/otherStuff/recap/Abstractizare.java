package com.example.jpa.otherStuff.recap;

public class Abstractizare {
    public static void main(String[] args){
        PremiumUser premiumUser = new PremiumUser("s", 25,10);
                StandardUser standardUser = new StandardUser("p", 26,18);
    }
}

abstract class User{
    protected String name;
    protected int age;

    public User(String name,int age){
        this.age = age;
        this.name=name;

    }
    public abstract double calculateDiscount();


    public void displayInfo(){
        System.out.println("Name : "+ name + "age" + age);

    }
}

class StandardUser extends  User{
    private int numberOfPurchases;


    public StandardUser(String name,int age, int numberOfPurchases){
        super(name,age);
        this.numberOfPurchases = numberOfPurchases;


    }


    @Override
    public double calculateDiscount() {
        return numberOfPurchases > 10 ? 0.1 : 0.0;
    }
}
class PremiumUser   extends  User{
    private int numberOfPurchases;


    public PremiumUser(String name,int age, int numberOfPurchases){
        super(name,age);
        this.numberOfPurchases = numberOfPurchases;


    }


    @Override
    public double calculateDiscount() {
        return numberOfPurchases > 10 ? 0.1 : 0.0;
    }
}




