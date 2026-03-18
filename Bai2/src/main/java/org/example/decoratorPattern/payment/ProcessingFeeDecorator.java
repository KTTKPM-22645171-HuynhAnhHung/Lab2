package org.example.decoratorPattern.payment;

public class ProcessingFeeDecorator extends PaymentDecorator {
    public ProcessingFeeDecorator(PaymentComponent wrappee) {
        super(wrappee);
    }

    @Override
    public void pay(double amount) {
        double fee = 10.0;
        System.out.println("Thêm phí xử lý: " + fee);
        super.pay(amount + fee);
    }
}