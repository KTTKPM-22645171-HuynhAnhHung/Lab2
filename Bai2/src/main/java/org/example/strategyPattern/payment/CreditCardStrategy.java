package org.example.strategyPattern.payment;

public class CreditCardStrategy implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Thanh toán " + amount + " bằng Thẻ tín dụng.");
    }
}