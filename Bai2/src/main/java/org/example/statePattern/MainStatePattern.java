package org.example.statePattern;

import org.example.statePattern.tax.*;
import org.example.statePattern.payment.*;
import org.example.statePattern.order.*;

public class MainStatePattern {
    public static void main(String[] args) {
        // 1. Quản lý đơn hàng
        Order order = new Order();
        order.process(); // NewOrderState -> ProcessingOrderState
        order.process(); // ProcessingOrderState -> DeliveredOrderState
        order.setState(new CancelledOrderState());
        order.process(); // CancelledOrderState

        // 2. Tính toán thuế
        ProductStateful product = new ProductStateful(1000);
        product.setTaxState(new ConsumptionTaxState());
        System.out.println("Thuế tiêu thụ: " + product.calculateTax());
        product.setTaxState(new VATTaxState());
        System.out.println("Thuế VAT: " + product.calculateTax());
        product.setTaxState(new LuxuryTaxState());
        System.out.println("Thuế xa xỉ: " + product.calculateTax());

        // 3. Thanh toán
        PaymentContext payment = new PaymentContext();
        payment.setState(new CreditCardState());
        payment.pay(500);
        payment.setState(new PaypalState());
        payment.pay(800);
    }
}