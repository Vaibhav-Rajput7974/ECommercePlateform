package com.example.eCommercePlateform.decorator;

import com.example.eCommercePlateform.decorator.Product;

public abstract class ProductDecorator implements Product {

    protected Product product;
    public ProductDecorator(Product product) {

        this.product = product;
    }

    @Override
    public String feature() {
        return product.feature();
    }
}
