package Sesion1;

public class Calc {
    public static void main(String[] args) {

        int val1 = 10;
        int val2 = 5;
        int rez;
        char op = 'M';

        if (op == 'A')
            rez = val1 + val2;
        else if (op == 'S')
            rez = val1 - val2;
        else if (op == 'D') {
            rez = val1 / val2;
        } else if (op == 'M') {
            rez = val1 * val2;
        } else {
            System.out.println("else");
            rez = 0;

            System.out.println("REZ = " + rez);
        }
    }

}