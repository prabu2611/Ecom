package com.testngfeatures;

import org.testng.annotations.Test;

public class Depends_Group {
	
	
	@Test(groups = "MobCategory")
	public void mobile() {
		
		System.out.println("Mobile");
	}
	
	@Test(groups = "Category")
	public void cloths() {
		System.out.println("Cloths");
	}
	
	@Test(groups = "SubCategory",dependsOnGroups = "MobCategory")
	public void iphone() {
		
		System.out.println("Iphone");
	}
	
	@Test(groups = "SubCategory",dependsOnGroups = "MobCategory")
	public void samsung() {
		
		System.out.println("Samsung");
	}

}
