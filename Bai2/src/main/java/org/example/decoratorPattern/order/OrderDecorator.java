package org.example.decoratorPattern.order;

public abstract class OrderDecorator implements OrderComponent {
    protected OrderComponent wrappee;

    public OrderDecorator(OrderComponent wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public void process() {
        wrappee.process();
    }
}