package Hooks_Adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Adactin {
	
	public static WebDriver driver;
	
	@Before(order = 1)
	public void beforeCollege3552() {
		
		System.out.println("Must Pass in 10th");
	   
	}
	

	@Before(order = 2)
	public void beforeCollege242() {
	
		System.out.println("Must Pass in 12th");
	   
	}
	
	
	
	@After(order = 2)
	public void afterCollege() {
		
		System.out.println("Got a Degree");
	}
	
	@After(order = 1)
	public void afterCollege2() {
		
		System.out.println("Got a Job");
	}

}
