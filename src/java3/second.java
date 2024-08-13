package java3;

import java.util.Scanner;

public class second {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("insert a number: ");
        int num1 = scanner.nextInt();
        System.out.print("insert the second number: ");
        int num2 = scanner.nextInt();

        System.out.println("sum = " + (num1 + num2));
    }
}
