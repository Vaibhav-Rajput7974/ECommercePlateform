package com.example.eCommercePlateform.command;

public class ApplyDiscount implements CheckoutCommand {

    private Order order;
    public ApplyDiscount(Order order) {

        this.order = order;
    }

    @Override
    public void execute() {
        order.applyDiscount();
    }
}
