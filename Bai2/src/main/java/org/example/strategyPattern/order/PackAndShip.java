package org.example.strategyPattern.order;

public class PackAndShip implements OrderAction {
    @Override
    public void execute() {
        System.out.println("Đóng gói và vận chuyển.");
    }
}