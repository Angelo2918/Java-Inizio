package Sesion_12_Abstraction;

public abstract class AClass implements A {
    @Override
    public void print() {
        System.out.println("Salut!");
    }
    @Override
    public void display(){

        System.out.println("AClass implementation!");
    }

}