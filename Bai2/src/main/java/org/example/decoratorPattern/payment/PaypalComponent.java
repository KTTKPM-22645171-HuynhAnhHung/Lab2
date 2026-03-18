package org.example.decoratorPattern.payment;

public class PaypalComponent implements PaymentComponent {
    @Override
    public void pay(double amount) {
        System.out.println("Thanh toán " + amount + " bằng PayPal.");
    }
}