package com.loosecouple;
//This class is depends on the another class
public class ServicePayment {
	UPIPayment upi;
	CreditPayment credit;
public void pay(double amount, String Type) {
	
	if(Type.equals("upi"))
	{
	upi.upipayment(amount);
	System.out.println("Sucessful payment rs-"+amount);
	}
	if(Type.equals("credit"))
	{
	credit.creditpayment(amount);
	System.out.println("Sucessful payment rs-"+amount);
	}
	
}
}
