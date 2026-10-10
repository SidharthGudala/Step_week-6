class MessWallet {
    private double balance;

    MessWallet(double amount) {
        if (amount < 0) {
            System.out.println("Invalid opening balance");
            amount = 0;
        }
        balance = amount;
    }

    void topUp(double amount) {
        if (amount <= 0)
            System.out.println("Invalid top-up");
        else
            balance += amount;
    }

    void deduct(double amount) {
        if (amount <= 0)
            System.out.println("Invalid amount");
        else if (amount > balance)
            System.out.println("Deduct rejected: insufficient balance");
        else
            balance -= amount;
    }

    double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        MessWallet w = new MessWallet(500);
        w.topUp(200);
        System.out.println("Balance after top-up: " + w.getBalance());
        w.deduct(1000);
        System.out.println("Final balance: " + w.getBalance());
    }
}
