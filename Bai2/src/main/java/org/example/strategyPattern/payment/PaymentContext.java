package org.example.strategyPattern.payment;

public class PaymentContext {
    private PaymentStrategy strategy;

    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void pay(double amount) {
        if (strategy != null) {
            strategy.pay(amount);
        }
    }
}