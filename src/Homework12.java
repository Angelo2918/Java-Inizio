import java.util.Scanner;

public class Homework12 {
    public static void main(String[] args) {

//Create a program that takes an integer as input and then increments
// and decrements it by 1, displaying the output at each stage
        Scanner scanner = new Scanner(System.in);

        int num = 15;
        System.out.println("Original value of the num: " + num);
        num++;
        System.out.println("variable++ = " + num);
        ++num;
        System.out.println("++variable = " + num);

        int num2 = 20;
        System.out.println("Original value of the num: " + num2);
        num2--;
        System.out.println("Integer num = " + num2);
        --num2;
        System.out.println("Integer num = " + num2);
    }
}
