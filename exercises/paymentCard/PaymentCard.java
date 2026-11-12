
package paymentCard;

public class PaymentCard {
    private double balance;

    public PaymentCard(double balance) {
        this.balance = balance;
    }

    public void eatAffordably() {
        if (this.balance >= 2.60) {
            this.balance -= 2.60;
        } else {
            System.out.println("Not enough balance");
        }

    }

    public void eatHeartily() {
        if (this.balance >= 4.60) {
            this.balance -= 4.60;
        } else {
            System.out.println("Not enough balance");
        }
    }

    public void addMoney(double amount) {
        if (amount > 0) {
            this.balance += amount;
        } else {
            System.out.println("Enter an amount greater than zero");
        }
    }

    public String toString() {
        return "Balance is $" + this.balance;
    }
}
