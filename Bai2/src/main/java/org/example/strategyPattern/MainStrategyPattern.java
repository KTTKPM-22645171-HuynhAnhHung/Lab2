package org.example.strategyPattern;

import org.example.strategyPattern.order.*;
import org.example.strategyPattern.tax.*;
import org.example.strategyPattern.payment.*;

public class MainStrategyPattern {
    public static void main(String[] args) {
        // 1. Quản lý đơn hàng
        OrderStrategy order = new OrderStrategy();
        order.setAction(new CheckOrderInfo());
        order.process();
        order.setAction(new PackAndShip());
        order.process();
        order.setAction(new UpdateDelivered());
        order.process();
        order.setAction(new CancelAndRefund());
        order.process();

        // 2. Tính toán thuế
        ProductStrategy product = new ProductStrategy(2000);
        product.setTaxStrategy(new ConsumptionTaxStrategy());
        System.out.println("Thuế tiêu thụ: " + product.calculateTax());
        product.setTaxStrategy(new VATTaxStrategy());
        System.out.println("Thuế VAT: " + product.calculateTax());
        product.setTaxStrategy(new LuxuryTaxStrategy());
        System.out.println("Thuế xa xỉ: " + product.calculateTax());

        // 3. Thanh toán
        PaymentContext payment = new PaymentContext();
        payment.setStrategy(new CreditCardStrategy());
        payment.pay(700);
        payment.setStrategy(new PaypalStrategy());
        payment.pay(900);
    }
}