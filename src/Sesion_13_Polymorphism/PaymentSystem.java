package Sesion_13_Polymorphism;


//Interfata Payment defineste comportamentele comune pentru toate tipurile de plati
interface Payment {
    void processPayment(double amount);//o metoda abstracta pentru procesarea platilor

    void showTransactionDetails();

}

abstract class CardPayment implements Payment {
    private String cardNumber;
    private String cardHolderName;


    public CardPayment(String cardNumber, String cardHolderName) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }

    @Override
    public void showTransactionDetails() {
        System.out.println("Plata realizata cu cardul: " + cardHolderName + "(Card: " + maskCardNumber() + ")");

    }

    private String maskCardNumber() {
        return "**** **** **** " + cardNumber.substring(cardNumber.length() - 4);

    }

    public String getCardHolderName() {
        return cardHolderName;
    }

}

class CreditCardPayment extends CardPayment {
    public CreditCardPayment(String cardNumber, String cardHolderName) {
        super(cardNumber, cardHolderName);
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Procesare plata card credit de : " + amount + "pentru " + super.getCardHolderName());
    }
}

class DebitCardPayment extends CardPayment {
    public DebitCardPayment(String cardNumber, String cardHolderName) {
        super(cardNumber, cardHolderName);
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Procesare plata card deb " + amount + "pentru " + super.getCardHolderName());
    }
}

class BankTransfer implements Payment {
    private String iban;
    private String bankName;

    public BankTransfer(String iban, String bankName) {
        this.iban = iban;
        this.bankName = bankName;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("TransferTransfer bancar de " + amount + "catre IBAN-ul " + iban + "la banca " + bankName);
    }

    @Override
    public void showTransactionDetails() {
        System.out.println("Detalii transfer bancar : Iban " + iban + "Banca: " + bankName);

    }
}

class CryptoPayment implements Payment {
    private String walletAddress;
    private String cryptoType;

    public CryptoPayment(String walletAddress, String cryptoType) {
        this.cryptoType = cryptoType;
        this.walletAddress = walletAddress;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Plata de  " + amount + " " + cryptoType + " cartre adresa " + walletAddress);
    }

    @Override
    public void showTransactionDetails() {
        System.out.println("Detali plata crypto: " + cryptoType + "wallet: " + walletAddress);
    }
}


public class PaymentSystem {
    public static void main(String... args) {
        Payment creditCard = new CreditCardPayment("1234567812345678 ", " Ion Popescu ");
        Payment debitCard = new DebitCardPayment("8765432187654321 ", " Maria ionescu ");
        Payment bankTransfer = new BankTransfer("RO79btrlro76546789 ", " BT");
        Payment cryptoPayment = new CryptoPayment("ierujsdjf54h32545fh", "Bitcoin ");

        Payment[] payments = {creditCard,debitCard,bankTransfer,cryptoPayment};

        for(Payment p : payments){
            p.processPayment( 100.0 );
            p.showTransactionDetails();
            System.out.println();
        }

    }
}
