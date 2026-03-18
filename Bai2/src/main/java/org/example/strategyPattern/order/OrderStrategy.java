package org.example.strategyPattern.order;

public class OrderStrategy {
    private OrderAction action;

    public void setAction(OrderAction action) {
        this.action = action;
    }

    public void process() {
        if (action != null) {
            action.execute();
        }
    }
}