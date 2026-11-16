
package paymentCard;

public class PaymentCard {
    private double balance;

    public PaymentCard(double balance) {
        this.balance = balance;
    }

    public double balance() {
        return this.balance;
    }

    public void addMoney(double amount) {
        if (amount > 0) {
            this.balance += amount;
        } else {
            System.out.println("Enter an amount greater than zero");
        }
    }

    public boolean takeMoney(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public String toString() {
        return "Balance is $" + this.balance;
    }
}
