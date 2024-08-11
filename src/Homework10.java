import java.util.Scanner;

public class Homework10 {
    public static void main(String[] args) {
//Write a program that reverses the sign of an entered integer using unary minus operator.
        Scanner scanner = new Scanner(System.in);
//
//        int aNumber;
//        aNumber = 10;
//        System.out.println(aNumber++);
//        System.out.println(++aNumber);
//        System.out.println(aNumber--);
//        System.out.println(--aNumber);

        System.out.print("Enter an integer: ");
        int sum = scanner.nextInt();

        sum = -sum;
        System.out.println("The reversed sign value is: " + sum);



    }
}
