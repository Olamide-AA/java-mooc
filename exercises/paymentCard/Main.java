package paymentCard;

public class Main {
    public static void main(String[] args) {
        PaymentCard card = new PaymentCard(5);
        card.eatAffordably();
        System.out.println(card);
        card.addMoney(-12);
        card.eatHeartily();
        System.out.println(card);
    }
}
