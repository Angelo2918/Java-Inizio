package Studi;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class FileCopyUtility {

    // Method to copy the contents of the source file to the destination file
    public static void copyFile(String sourcePath, String destinationPath) {
        try (FileInputStream fis = new FileInputStream(sourcePath);
             FileOutputStream fos = new FileOutputStream(destinationPath)) {

            byte[] buffer = new byte[1024];
            int bytesRead;

            // Read from source and write to destination
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Source file not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error occurred while copying the file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Prompt the user to enter the source file path
            System.out.print("Enter the source file path: ");
            String sourcePath = scanner.nextLine();

            // Prompt the user to enter the destination file path
            System.out.print("Enter the destination file path: ");
            String destinationPath = scanner.nextLine();

            // Call the copyFile method
            copyFile(sourcePath, destinationPath);

        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }

        scanner.close();
    }
}
