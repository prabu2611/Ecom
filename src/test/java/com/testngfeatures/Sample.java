package com.testngfeatures;

import org.testng.annotations.Test;

public class Sample {
	
	
	//Failed Test Case
	
	
	@Test
	public void testCase1() {
		
		System.out.println("Welcome");
		
		//System.out.println(2/0);
	}
	
	
	@Test
	public void testCase2() {
		System.out.println("Hello");
		//System.out.println(3/0);
	}
	
	

}
