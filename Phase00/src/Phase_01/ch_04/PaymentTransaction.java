package Phase_01.ch_04;

public class PaymentTransaction {
    private double amount;
    private String name;

    public PaymentTransaction(double amount, String name) {
        setAmount(amount);
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        if (amount > 0){
            this.amount=amount;
        } else {
            throw new IllegalArgumentException("Amount must be positive");

        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PaymentTransaction{" +
                "amount=" + amount +
                ", name='" + name + '\'' +
                '}';
    }
}
