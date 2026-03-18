package org.example.decoratorPattern;

import org.example.decoratorPattern.order.*;
import org.example.decoratorPattern.tax.*;
import org.example.decoratorPattern.payment.*;

public class MainDecoratorPattern {
    public static void main(String[] args) {
        // 1. Quản lý đơn hàng
        OrderComponent order = new BaseOrder();
        order = new CheckInfoDecorator(order);
        order = new PackShipDecorator(order);
        order = new DeliveredDecorator(order);
        order.process();
        OrderComponent cancelledOrder = new CancelRefundDecorator(new BaseOrder());
        cancelledOrder.process();

        // 2. Tính toán thuế
        TaxComponent baseTax = new BaseTaxComponent(3000);
        TaxComponent tax1 = new ConsumptionTaxDecorator(baseTax);
        TaxComponent tax2 = new VATTaxDecorator(tax1);
        TaxComponent tax3 = new LuxuryTaxDecorator(tax2);
        System.out.println("Tổng thuế (tiêu thụ + VAT + xa xỉ): " + tax3.calculate());

        // 3. Thanh toán
        PaymentComponent creditCard = new CreditCardComponent();
        PaymentComponent paypal = new PaypalComponent();
        PaymentComponent creditCardWithFee = new ProcessingFeeDecorator(creditCard);
        PaymentComponent paypalWithDiscount = new DiscountDecorator(paypal);
        System.out.println("Thanh toán thẻ tín dụng có phí xử lý:");
        creditCardWithFee.pay(1000);
        System.out.println("\nThanh toán PayPal có mã giảm giá:");
        paypalWithDiscount.pay(1200);
        System.out.println("\nThanh toán thẻ tín dụng có phí xử lý và mã giảm giá:");
        PaymentComponent combo = new DiscountDecorator(new ProcessingFeeDecorator(creditCard));
        combo.pay(1500);
    }
}