package com.testngfeatures;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowser {
	
	
	@Test
	@Parameters("browser")
	public void browser(String browserType) {
		
//		System.out.println("Which Browser Do you Want??");
//		
//		System.out.println("chrome means 'ch' or edge means 'ed'");
//		
//		Scanner s = new Scanner(System.in);
//		
//		String browserType = s.nextLine();
		
		
		if (browserType.equalsIgnoreCase("ch")) {
			
			WebDriverManager.chromedriver().setup();
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://adactinhotelapp.com/");
			
		}
		
		else if(browserType.equalsIgnoreCase("ed")) {
			
			WebDriverManager.edgedriver().setup();
			
			WebDriver driver = new EdgeDriver();
			
			driver.get("https://adactinhotelapp.com/");
			
		}
		
		else {
			
			System.out.println("Invalid Browser");
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
