import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//Write a program to check if a number is positive or negative using logical complement operator.

        System.out.print("Enter a number");
        int num = scanner.nextInt();

        boolean isPositive = (num > 0);

        if (isPositive) {
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is negative.");


        }
    }
}