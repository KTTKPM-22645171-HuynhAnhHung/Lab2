package org.example.strategyPattern.order;

public class CheckOrderInfo implements OrderAction {
    @Override
    public void execute() {
        System.out.println("Kiểm tra thông tin đơn hàng.");
    }
}