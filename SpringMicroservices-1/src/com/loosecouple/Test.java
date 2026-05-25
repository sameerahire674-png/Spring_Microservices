package com.loosecouple;
//callling the servicepayment method and access the all class method 
public class Test {
public static void main(String[] args) {
		ServicePayment service=new ServicePayment();
		service.upi=new UPIPayment();
		service.credit=new CreditPayment();
		service.pay(4000,"upi");
		
}
}
