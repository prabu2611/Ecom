package com.testngfeatures;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Invo {
	
	static WebDriver driver;
	
	
	@Test(timeOut = 50000)
	public void login() {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		
	}
	
	
	@Test(invocationCount = 4,invocationTimeOut = 80000)
	public void payment() throws InterruptedException {
		

		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
	}

}
