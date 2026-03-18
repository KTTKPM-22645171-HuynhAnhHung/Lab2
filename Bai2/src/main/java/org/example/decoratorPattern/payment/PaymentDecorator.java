package org.example.decoratorPattern.payment;

public abstract class PaymentDecorator implements PaymentComponent {
    protected PaymentComponent wrappee;

    public PaymentDecorator(PaymentComponent wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public void pay(double amount) {
        wrappee.pay(amount);
    }
}