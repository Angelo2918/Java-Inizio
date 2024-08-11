import java.security.cert.CertPathValidatorException;
import java.util.Scanner;

public class Homework9 {
public static void main(String[] args){

//. Write a program that calculates the area of a rectangle.
// Take the length and breadth as inputs
    double length = 0.0;
    double width = 0.0;
    double area = 0.0;

    Scanner reader = new Scanner(System.in);
    System.out.print("Enter lenght of the rectangle: ");
    length = reader.nextDouble();
    System.out.print("Enter the width of the rectangle: ");
    width = reader.nextDouble();
    area = length * width;
    System.out.println("Area of rectangle: " + area);
    reader.close();
}
}
