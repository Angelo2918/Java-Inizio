package com.example.jpa.otherStuff.recap;

import com.example.jpa.exceptions.EmailSendingException;

public class ExceptionDemo {
    //checked exceptions
    static class InsuficientFoundsException extends Exception {
        public InsuficientFoundsException(String message) {
            super(message);
        }

    }

    //uncheked except
    static class AccountNotActiveException extends RuntimeException {
        public AccountNotActiveException(String message) {
            super(message);
        }
    }

    static class BankAccount {
        private long balance = 1000L;
        private boolean isActive = false;


        public void transfer(long amount) throws InsuficientFoundsException {
            if (amount > balance)
                throw new InsuficientFoundsException("Fonduri insuficiente. Sold curent: " + balance);

            balance -= amount;


        }

        public void withdraw(long amount) {
            if (!isActive)
                throw new AccountNotActiveException("Cont inactiv!");

            if (amount < 0)
                throw new IllegalArgumentException("Suma de retragere trebuie sa fie pozitiva!");

            balance -= amount;
        }
    }

    public static void main(String... args) {
        BankAccount account = new BankAccount();


        try {
            account.transfer(900L);
        } catch (InsuficientFoundsException ex) {
            ex.printStackTrace();
        }


        try {
            account.withdraw(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("Suma gresita! " + e.getMessage());
        } catch (AccountNotActiveException e) {
            System.out.println("Exceptie: " + e.getMessage());


        }
    }
}
