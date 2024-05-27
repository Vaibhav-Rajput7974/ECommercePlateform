package com.example.eCommercePlateform.decorator;

public class ExtendedWarranties extends ProductDecorator {
    public ExtendedWarranties(Product product) {

        super(product);
    }

    @Override
    public String feature() {

        return super.feature()+ " extend warranty ";
    }
}
