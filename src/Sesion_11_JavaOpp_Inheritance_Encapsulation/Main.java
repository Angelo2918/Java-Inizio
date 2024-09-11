package Sesion_11_JavaOpp_Inheritance_Encapsulation;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("John");
        person.setLastName("Doe");
        person.setAge(25);


        System.out.println("name " + person.getFirstName() + " " + person.getLastName());
        System.out.println("age" + person.getAge());

        person.setAge(-20);

    }
}
