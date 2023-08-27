package com.testngfeatures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Para {
	//TDD -> Test Driven Development
	
	@Test
	@Parameters({"username","password"})
	public static void login(String uname,String pwd) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		
		driver.findElement(By.id("username")).sendKeys(uname);
		
		driver.findElement(By.id("password")).sendKeys(pwd);
		
		driver.findElement(By.id("login")).click();
	
		
		
//		System.out.println("Username: "+uname);
//		
//		System.out.println("Password: "+pwd);
//		
//		System.out.println("Login Sucessfully");
	}
	

}
