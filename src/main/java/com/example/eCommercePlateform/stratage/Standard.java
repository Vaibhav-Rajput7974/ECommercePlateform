package com.example.eCommercePlateform.stratage;

import com.example.eCommercePlateform.stratage.Shipping;

public class Standard implements Shipping {
    @Override
    public void cost() {

        System.out.println(" 100 ");
    }
    @Override
    public void deliveryTime() {

        System.out.println("Within a week ");
    }
}
