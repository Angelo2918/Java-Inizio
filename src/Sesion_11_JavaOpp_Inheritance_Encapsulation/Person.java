package Sesion_11_JavaOpp_Inheritance_Encapsulation;

public class Person {
    private String firstName;
    private String LastName;
    private int age;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0)
            System.out.println("Age cannot be nagative");
        else {

            this.age = age;
        }

        public String getLastName () {
            return LastName;
        }

        public void setLastName (String LastName){
            this.LastName = LastName;
        }
    }

    public void setLastName(String doe) {
    }

    public String getLastName() {
    }
