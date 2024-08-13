package Homework;

import java.util.Scanner;

public class Homework13 {
    public static void main(String[] args) {
// Write a program to calculate the price after discount. Take the original price and discount
// percentage as input. Use compound assignment operator to perform the calculation.

        Scanner sc = new Scanner(System.in);

        int price;
        int discount;
        System.out.println("Enter price of the product: ");
        price = sc.nextInt();

        System.out.println("Enter the discount(%) of the product: ");
        discount = sc.nextInt();


    int discountPrice = (price * discount ) / 100;
    int finalPrice = price - discountPrice;

        System.out.println("Discount price is: " + discountPrice);
        System.out.println("Final price is: " + finalPrice);

    }
}