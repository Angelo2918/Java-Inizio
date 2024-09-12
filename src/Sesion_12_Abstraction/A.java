package Sesion_12_Abstraction;

public interface A {
    void print();  //public abstract

   default void display(){

        System.out.println("Default method");

}

}
