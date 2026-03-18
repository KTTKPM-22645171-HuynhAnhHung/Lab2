package org.example.strategyPattern.payment;

public class PaypalStrategy implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Thanh toán " + amount + " bằng PayPal.");
    }
}