package Recap;

import java.util.Random;
import java.util.Scanner;

public class Joc {
    public static void main(String[] args) {
        System.out.println("Jocul");

        Scanner scanner = new Scanner(System.in);
        String alegere;
        do {
            Joc(scanner);
            System.out.println("Daca vrei sa mai joci scrie Da.");
            alegere = scanner.nextLine();
        } while (alegere.equals("Da"));


    }

    public static void Joc(Scanner scanner) {
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        boolean guessedNumber = false;
        while (!guessedNumber) {
            System.out.println("Guess Number: ");
            int userNumber = scanner.nextInt();
            if (userNumber == number) {
                guessedNumber = true;
                continue;
            }

            if (userNumber < number)
                System.out.println("Numarul este mai mare!");
            else
                System.out.println("Numarul este mai mic!");


        }
        System.out.println("Felicitari");
    }

}
