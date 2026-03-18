package org.example.statePattern.order;

public class DeliveredOrderState implements OrderState {
    @Override
    public void handle(Order order) {
        System.out.println("Cập nhật trạng thái đơn hàng là đã giao.");
    }
}