package com.example.eCommercePlateform.adpater;

public class PaymentAdapter implements Payment {

    private PaymentProvider paymentProvider;

    public PaymentAdapter(PaymentProvider paymentProvider) {

        this.paymentProvider = paymentProvider;
    }
    @Override
    public void pay() {
        paymentProvider.payWith();
    }
}
