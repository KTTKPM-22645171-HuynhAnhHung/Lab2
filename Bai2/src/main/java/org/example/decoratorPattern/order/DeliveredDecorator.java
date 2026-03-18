package org.example.decoratorPattern.order;

public class DeliveredDecorator extends OrderDecorator {
    public DeliveredDecorator(OrderComponent wrappee) {
        super(wrappee);
    }

    @Override
    public void process() {
        super.process();
        System.out.println("Cập nhật trạng thái đơn hàng là đã giao.");
    }
}