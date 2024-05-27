package com.example.eCommercePlateform.adpater;

public class PhonePay implements PaymentProvider {
    @Override
    public void payWith() {

        System.out.println("Paying with the phonePay ");
    }
}
