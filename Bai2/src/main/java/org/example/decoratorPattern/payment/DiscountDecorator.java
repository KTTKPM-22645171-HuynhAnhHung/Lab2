package org.example.decoratorPattern.payment;

public class DiscountDecorator extends PaymentDecorator {
    public DiscountDecorator(PaymentComponent wrappee) {
        super(wrappee);
    }

    @Override
    public void pay(double amount) {
        double discount = 20.0;
        System.out.println("Áp dụng mã giảm giá: " + discount);
        super.pay(amount - discount);
    }
}