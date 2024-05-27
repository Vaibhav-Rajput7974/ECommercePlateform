package com.example.eCommercePlateform.command;

public class UpdateQuantities implements CheckoutCommand {

    private Order order;

    public UpdateQuantities(Order order) {

        this.order = order;
    }
    @Override
    public void execute() {
        order.updateQuantity();
    }
}
