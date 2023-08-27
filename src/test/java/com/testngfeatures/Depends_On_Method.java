package com.testngfeatures;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Depends_On_Method {

	// login - buynow - payment - cashback

	@Test(priority = -2)
	public void login() {

		System.out.println("Login");
	}

	@Test(priority = -1)
	public void buyNow() {
		System.out.println("Buy Now");
	}

	
	@Test
	public void payment() {

		System.out.println("Payment");
		System.out.println(10/0);
	}
	
	@Test(dependsOnMethods = "payment",alwaysRun = true)
	public void cashBack() {

		System.out.println("Cashback Applied");
	}


}
