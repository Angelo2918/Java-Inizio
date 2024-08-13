package Homework;

import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//Write a Java program that uses both the increment (++) and decrement (--)
// operators in a loop to count up to 10 and then back down to 1.

        for (int a = 1; a <= 10; a++) {
            System.out.println("A value up is: " + a);

        }

        for (int a = 10; a >= 1; a--) {

                System.out.println("A value down is: " + a);

        }
    }
}
