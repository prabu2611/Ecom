package com.testngfeatures;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_Test {
	
	
	
	
	
	@Test(priority = -2)
	public void login() {
		
		System.out.println("Login");
	}
	
	@Test(priority = -1)
	public void buyNow() {
		System.out.println("Buy Now");
	}
	
	@Test(enabled = true,priority = 1)
	public void cashBack() {
		
		System.out.println("Cashback Applied");
	}
	
	@Test(priority = 2)
	public void payment() {
		
		System.out.println("Payment");
	}

}



//Login - Home Page - Product - Add to Cart - Buy Now - CashBack - Payment
