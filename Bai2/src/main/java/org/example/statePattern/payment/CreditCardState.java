package org.example.statePattern.payment;

public class CreditCardState implements PaymentState {
    @Override
    public void pay(PaymentContext context, double amount) {
        System.out.println("Thanh toán " + amount + " bằng Thẻ tín dụng.");
    }
}