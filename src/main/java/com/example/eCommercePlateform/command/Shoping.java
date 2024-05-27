package com.example.eCommercePlateform.command;

import com.example.eCommercePlateform.decorator.Product;
import com.example.eCommercePlateform.adpater.Payment;
import com.example.eCommercePlateform.stratage.Shipping;

public class Shoping {

    private CheckoutCommand checkoutCommand;

    public void setCheckoutCommand(CheckoutCommand checkoutCommand) {

        this.checkoutCommand = checkoutCommand;
    }

    public void execute(){
        checkoutCommand.execute();
    }

    public void product(Product product){

        System.out.println(product.feature());
    }

    public void ship(Shipping shipping){
        shipping.cost();
        shipping.deliveryTime();
    }

    public void pay(Payment payment){
        payment.pay();
    }

}
