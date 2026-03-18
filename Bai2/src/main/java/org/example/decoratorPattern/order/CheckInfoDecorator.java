package org.example.decoratorPattern.order;

public class CheckInfoDecorator extends OrderDecorator {
    public CheckInfoDecorator(OrderComponent wrappee) {
        super(wrappee);
    }

    @Override
    public void process() {
        super.process();
        System.out.println("Kiểm tra thông tin đơn hàng.");
    }
}