import java.util.Scanner;

public class Homework11 {
    public static void main(String[] args) {
        //Write a Java program that takes two boolean inputs from a user.
        // Apply the logical negation operator (!) to each and print the result.
        Scanner scanner = new Scanner(System.in);
        int count = 6;

        System.out.println(!(count > 2));  // prints true
        System.out.println(!(count <= 2)); // prints false
        boolean x = true;
        boolean y = false;

        System.out.println(!(x && y));  // prints true
        System.out.println(!(x || y));  // prints false
    }
}