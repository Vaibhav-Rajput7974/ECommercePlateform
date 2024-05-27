package com.example.eCommercePlateform;

import com.example.eCommercePlateform.adpater.GPay;
import com.example.eCommercePlateform.adpater.PaymentAdapter;
import com.example.eCommercePlateform.adpater.PaymentProvider;
import com.example.eCommercePlateform.adpater.PhonePay;
import com.example.eCommercePlateform.command.*;
import com.example.eCommercePlateform.decorator.CommonProduct;
import com.example.eCommercePlateform.decorator.ExtendedWarranties;
import com.example.eCommercePlateform.decorator.GiftWrapping;
import com.example.eCommercePlateform.decorator.Product;
import com.example.eCommercePlateform.stratage.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ECommercePlateformApplication {

	public static void main(String[] args) {

		// Command pattern
		Order order = new Order();
		CheckoutCommand applyDiscountCommand = new ApplyDiscount(order);
		CheckoutCommand removeItemCommand = new RemoveItem(order);
		CheckoutCommand updateQuantities = new UpdateQuantities(order);
		Shoping shoping = new Shoping();
		shoping.setCheckoutCommand(applyDiscountCommand);
		shoping.execute();

		shoping.setCheckoutCommand(removeItemCommand);
		shoping.execute();

		shoping.setCheckoutCommand(updateQuantities);
		shoping.execute();

		// Decorator Pattern
		Product extendedWarrantiGiftWrappingOnCommonProduct = new ExtendedWarranties(new GiftWrapping(new CommonProduct()));

		Product extendedWarraties = new ExtendedWarranties(new CommonProduct());
		shoping.product(extendedWarraties);
		shoping.product(extendedWarrantiGiftWrappingOnCommonProduct);

		// Strategy Pattern
		Shipping expenditedShipping = new Expedited();
		Shipping standardShipping = new Standard();
		Shipping internationalShipping = new International();

		shoping.ship(expenditedShipping);
		shoping.ship(standardShipping);
		shoping.ship(internationalShipping);

		//Adapter Pattern
		PaymentProvider phonePay = new PhonePay();
		PaymentProvider gPay = new GPay();

		PaymentAdapter payWithPhonePay = new PaymentAdapter(phonePay);
		PaymentAdapter payWithGpay = new PaymentAdapter(gPay);

		shoping.pay(payWithGpay);
		shoping.pay(payWithPhonePay);
	}

}
