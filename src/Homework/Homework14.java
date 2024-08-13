package Homework;

import java.util.Scanner;

public class Homework14 {
    public static void main(String[] args) {
//Create a program that checks if a user entered number is within a
// specific range (e.g., 1-100). Use relational operators for the checks.

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if ( num >= 1 && num <= 100) {
            System.out.println("The number is within the range of 1 to 100.");
        } else {
            System.out.println("The number is not in range of 1-100.");
        }
    }
}
