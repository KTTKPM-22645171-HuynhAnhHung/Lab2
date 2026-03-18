package org.example.decoratorPattern.order;

public class CancelRefundDecorator extends OrderDecorator {
    public CancelRefundDecorator(OrderComponent wrappee) {
        super(wrappee);
    }

    @Override
    public void process() {
        super.process();
        System.out.println("Hủy đơn hàng và hoàn tiền.");
    }
}