package Studi;

import java.util.Scanner;

public class Calculator {

    // Method to perform the calculation
    public static double calculate(double operand1, double operand2, char operator) {
        switch (operator) {
            case '+':
                return operand1 + operand2;
            case '-':
                return operand1 - operand2;
            case '*':
                return operand1 * operand2;
            case '/':
                if (operand2 == 0) {
                    throw new ArithmeticException("Division by zero is not allowed.");
                }
                return operand1 / operand2;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Prompt the user to enter the first number
            System.out.print("Enter the first number: ");
            double num1 = Double.parseDouble(scanner.nextLine());

            // Prompt the user to enter the second number
            System.out.print("Enter the second number: ");
            double num2 = Double.parseDouble(scanner.nextLine());

            // Prompt the user to enter the operator
            System.out.print("Enter the operator (+, -, *, /): ");
            char operator = scanner.nextLine().charAt(0);

            // Perform the calculation
            double result = calculate(num1, num2, operator);

            // Display the result
            System.out.println("The result is: " + result);

        } catch (NumberFormatException e) {
            System.out.println("Invalid number format. Please enter valid numbers.");
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }

        scanner.close();
    }
}
