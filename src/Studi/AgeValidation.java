package Studi;

import java.util.Scanner;

// Custom checked exception for invalid age
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class AgeValidation {

    // Method to validate age
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 110) {
            throw new InvalidAgeException("Age must be between 0 and 110.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Prompt the user to enter their age
            System.out.print("Enter your age: ");
            int age = Integer.parseInt(scanner.nextLine());

            // Validate the age
            validateAge(age);

            // Display a success message if no exception is thrown
            System.out.println("Age is valid.");

        } catch (InvalidAgeException e) {
            // Handle the InvalidAgeException
            System.out.println("Error: " + e.getMessage());
        } catch (NumberFormatException e) {
            // Handle invalid number format
            System.out.println("Invalid input. Please enter a valid number.");
        } catch (Exception e) {
            // Handle any other unexpected exceptions
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }

        scanner.close();
    }
}
