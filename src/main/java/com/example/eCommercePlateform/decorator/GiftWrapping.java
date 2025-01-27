package com.example.eCommercePlateform.decorator;

public class GiftWrapping extends ProductDecorator {
    public GiftWrapping(Product product) {

        super(product);
    }

    @Override
    public String feature() {
        return super.feature()+ " with gift wrapping ";
    }
}
