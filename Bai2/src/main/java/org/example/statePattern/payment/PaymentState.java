package org.example.statePattern.payment;

import org.example.statePattern.payment.PaymentContext;

public interface PaymentState {
    void pay(PaymentContext context, double amount);
}