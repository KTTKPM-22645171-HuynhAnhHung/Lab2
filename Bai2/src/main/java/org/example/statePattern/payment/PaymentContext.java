package org.example.statePattern.payment;

public class PaymentContext {
    private PaymentState state;

    public void setState(PaymentState state) {
        this.state = state;
    }

    public void pay(double amount) {
        if (state != null) {
            state.pay(this, amount);
        }
    }
}