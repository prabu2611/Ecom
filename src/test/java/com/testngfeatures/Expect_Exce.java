package com.testngfeatures;

import org.testng.annotations.Test;

public class Expect_Exce {

	@Test(expectedExceptions = {Exception.class})
	public void excep() {
		String name = null;

		System.out.println(name.length());
		
		System.out.println("Welcome");

		System.out.println(10 / 0);

		System.out.println("Hello");

	}

}
