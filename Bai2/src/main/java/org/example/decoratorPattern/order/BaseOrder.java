package org.example.decoratorPattern.order;

public class BaseOrder implements OrderComponent {
    @Override
    public void process() {
        System.out.println("Đơn hàng cơ bản.");
    }
}