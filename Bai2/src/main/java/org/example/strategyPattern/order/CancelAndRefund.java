package org.example.strategyPattern.order;

public class CancelAndRefund implements OrderAction {
    @Override
    public void execute() {
        System.out.println("Hủy đơn hàng và hoàn tiền.");
    }
}