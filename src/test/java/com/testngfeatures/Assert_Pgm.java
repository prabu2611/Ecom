package com.testngfeatures;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assert_Pgm {
	
	
	//BA - UI/UX - Web Design - Front End Developer(Client) - Back End Developer(Server Side) - Full Stack Developer
	
	//QA (Manual and Automation) -DBMS (Oracle and Cloud ) - Devops -> DA - DS - 
	
	
	
	//Cucumber - BDD Framework
	
	//BDD - Behavior Driven Development
	
	
	//Feature File - plain English Documentation(Gherkin) 
	
	//StepDefinition - Actual Code (Java + Selenium)
	
	//Runner Class(Feature File + Step Definition)
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//Hard Assert ->
	
	//Soft Assert
	
	SoftAssert soft = new SoftAssert();
	
	@Test
	public void browser() {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		//Assert.assertNotEquals(title,"Adactin.com");
		
		soft.assertEquals(title,"Adactin.com");
		
		driver.quit();
		
		soft.assertAll();
		
	}

}
