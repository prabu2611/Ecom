package com.testngfeatures;

import org.testng.annotations.Test;

public class Grouping {

	// Java Code Converts to XML
	// XML

	@Test(groups = { "ROM=128GB", "RAM=4GB" })
	public void iphone1() {

		System.out.println("Brand : IPhone ");
		System.out.println("Model : 1");
		System.out.println("RAM  : 4GB");
		System.out.println("Storage: 128GB");

	}

	@Test(groups = { "ROM=128GB", "RAM=8GB" })
	public void iphone2() {

		System.out.println("Brand : IPhone ");
		System.out.println("Model : 2");
		System.out.println("RAM  : 8GB");
		System.out.println("Storage: 128GB");

	}

	@Test(groups = { "ROM=128GB", "RAM=8GB" })
	public void samsung() {

		System.out.println("Brand : Samsung");
		System.out.println("Model : 1");
		System.out.println("RAM  : 8GB");
		System.out.println("Storage: 128GB");

	}

	@Test(groups = { "ROM=64GB", "RAM=4GB" })
	public void oppo() {

		System.out.println("Brand : Oppo");
		System.out.println("Model : 1");
		System.out.println("RAM  : 4GB");
		System.out.println("Storage: 64GB");

	}

	@Test(groups = "ROM=128GB")
	public void vivo() {

		System.out.println("Brand : Vivo");
		System.out.println("Model : 1");
		System.out.println("RAM  : 8GB");
		System.out.println("Storage: 128GB");

	}

	@Test(groups = "ROM=128GB")
	public void samsung2() {

		System.out.println("Brand : Samsung");
		System.out.println("Model : 2");
		System.out.println("RAM  : 16GB");
		System.out.println("Storage: 128GB");

	}

	@Test(groups = { "ROM=256GB", "RAM=8GB" })
	public void iphone3() {

		System.out.println("Brand : IPhone");
		System.out.println("Model : 3");
		System.out.println("RAM  : 8GB");
		System.out.println("Storage: 256GB");

	}

	@Test(groups = "ROM=128GB")
	public void oppo2() {

		System.out.println("Brand : Oppo");
		System.out.println("Model : 2");
		System.out.println("RAM  : 8GB");
		System.out.println("Storage: 128GB");

	}

	@Test(groups = "ROM=666GB")
	public void redmi() {

		System.out.println("Brand : Redmi");
		System.out.println("Model : 1");
		System.out.println("RAM  : 4GB");
		System.out.println("Storage: 128GB");

	}

	@Test(groups = "redmi",dependsOnGroups ="ROM=666GB")
	public void redmi2() {

		System.out.println("Brand : Redmi");
		System.out.println("Model : 2");
		System.out.println("RAM  : 8GB");
		System.out.println("Storage: 256GB");

	}

}
