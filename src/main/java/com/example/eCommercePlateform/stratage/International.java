package com.example.eCommercePlateform.stratage;

import com.example.eCommercePlateform.stratage.Shipping;

public class International implements Shipping {
    @Override
    public void cost() {

        System.out.println("100000 ");
    }
    @Override
    public void deliveryTime() {

        System.out.println("within 1 day ");
    }

}
