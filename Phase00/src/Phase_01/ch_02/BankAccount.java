package Phase_01.ch_02;

public class BankAccount {
    private String accountHolder;
    private double balance;


    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void displayBalance() {
        System.out.println("Account Holder: " + accountHolder + ", Balance: " + balance);
    }
}
