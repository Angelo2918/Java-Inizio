import java.util.Scanner;

public class Homework6 {
public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
//Write a Java program that takes two numbers from the user and uses relational operators to display whether the first
// number is greater than, less than, or equal to the second number.

    System.out.print("Enter first number:");
    int num1 = scanner.nextInt();
    System.out.print("Enter second number:");
    int num2 = scanner.nextInt();


    if (num1 < num2) {

    System.out.println("First number is less than second number.");
    } else if (num1 > num2) {
    System.out.println("First number is grater than second number.");
    } else {
        System.out.println("First number is equal to second number.");
    }
}
}
