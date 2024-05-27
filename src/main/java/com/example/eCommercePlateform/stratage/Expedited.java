package com.example.eCommercePlateform.stratage;

import com.example.eCommercePlateform.stratage.Shipping;

public class Expedited implements Shipping {
    @Override
    public void cost() {

        System.out.println("1000 ");
    }
    @Override
    public void deliveryTime() {

        System.out.println("Within 3 day ");
    }
}
