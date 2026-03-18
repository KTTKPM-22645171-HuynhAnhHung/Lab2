package org.example.statePattern.order;

public interface OrderState {
    void handle(Order order);
}