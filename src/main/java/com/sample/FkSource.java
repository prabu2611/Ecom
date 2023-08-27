package com.sample;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FkSource {
	
	
	static WebDriver driver;//null driver
	
	public static void property() {
		
		System.out.println("Enter the Browser Name:");
		
		Scanner s =new Scanner(System.in);
		
		String browserName=s.nextLine();
		
		
		if (browserName.equalsIgnoreCase("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			
			driver=new ChromeDriver();
			
		}
		
		else if (browserName.equalsIgnoreCase("edge")) {
			
			WebDriverManager.edgedriver().setup();
			
			driver =new EdgeDriver();
			
		}
		
		else {
			
			System.out.println("Invalid Browser");
		}
		
		
		
		
	}
	
	public static void maxi() {
		
		driver.manage().window().maximize();
	}
	
	public static void urlLanuch() {
		
		driver.get("https://www.flipkart.com/");
	}

}
