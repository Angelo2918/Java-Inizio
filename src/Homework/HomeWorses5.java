package Homework;
import java.util.Scanner;
public class HomeWorses5 {
      //  System.out.println("Incercarile mele");

            public static void main(String[] args) {
//17*sesion4
                String Username;
                String Password;

                Password = "8989";
                Username = "Veronica";

                Scanner input1 = new Scanner(System.in);
                System.out.println("Enter Username : ");
                String username = input1.next();

                Scanner input2 = new Scanner(System.in);
                System.out.println("Enter Password : ");
                String password = input2.next();

                if (username.equals(Username) && password.equals(Password)) {

                    System.out.println("Access Granted! Welcome!");
                } else if (username.equals(Username)) {
                    System.out.println("Invalid Password!");
                } else if (password.equals(Password)) {
                    System.out.println("Invalid Username!");
                } else {
                    System.out.println("Invalid Username & Password!");
                }


            }

}
