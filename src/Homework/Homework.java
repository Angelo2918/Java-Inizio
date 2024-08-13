package Homework;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
//Write a Java program to take two numbers as input and display the result
// of addition, subtraction, multiplication, division, and modulus.

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.println("Addition: " + (num1 + num2));
        System.out.println("Substraction: " + (num1 - num2));
        System.out.println("Multiplication: " + (num1 * num2));
        System.out.println("Division: " + (num1 / num2));
        System.out.println("Modulus: " + (num1 % num2));


    }
}


