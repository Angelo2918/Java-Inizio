package Homework;

import java.util.Scanner;

public class Homework2 {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
//Create a Java program where you increment and decrement the same variable.
// Display the value of the variable after each operation.

    int x = 20;
    System.out.println("Initiale value: " + x);

    x++;
    System.out.println("After increment: " + x);

    x--;
    System.out.println("After decrement: " + x);
}
}

