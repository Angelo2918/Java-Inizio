package TemeAbstraction;

abstract class Bank {
    abstract int getBalance();
}

class BankA extends Bank {
    @Override
    int getBalance() {
        return 100;
    }
}

class BankB extends Bank {
    @Override
    int getBalance() {
        return 150;
    }
}

class BankC extends Bank {
    @Override
    int getBalance() {

        return 200;

    }
}

