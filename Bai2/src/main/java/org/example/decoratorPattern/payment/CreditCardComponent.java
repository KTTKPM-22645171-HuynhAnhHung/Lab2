package org.example.decoratorPattern.payment;

public class CreditCardComponent implements PaymentComponent {
    @Override
    public void pay(double amount) {
        System.out.println("Thanh toán " + amount + " bằng Thẻ tín dụng.");
    }
}