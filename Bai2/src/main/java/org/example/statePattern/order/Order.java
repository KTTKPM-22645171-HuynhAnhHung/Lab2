package org.example.statePattern.order;

import org.example.statePattern.order.OrderState;
import org.example.statePattern.order.NewOrderState;

public class Order {
    private OrderState state;

    public Order() {
        this.state = new NewOrderState();
    }

    public void setState(OrderState state) {
        this.state = state;
    }

    public void process() {
        state.handle(this);
    }
}