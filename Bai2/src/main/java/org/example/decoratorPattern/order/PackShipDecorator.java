package org.example.decoratorPattern.order;

public class PackShipDecorator extends OrderDecorator {
    public PackShipDecorator(OrderComponent wrappee) {
        super(wrappee);
    }

    @Override
    public void process() {
        super.process();
        System.out.println("Đóng gói và vận chuyển.");
    }
}