package org.example.strategyPattern.order;

public class UpdateDelivered implements OrderAction {
    @Override
    public void execute() {
        System.out.println("Cập nhật trạng thái đơn hàng là đã giao.");
    }
}