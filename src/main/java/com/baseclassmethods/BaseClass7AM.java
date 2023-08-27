package com.baseclassmethods;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass7AM {

	public static WebDriver driver;

	// Reuseable Codes
	// Secure

	public static WebDriver browserLanuch(String browserType) {

		if (browserType.equalsIgnoreCase("chrome")) {

			WebDriverManager.chromedriver().setup();

			driver = new ChromeDriver();

		}

		else if (browserType.equalsIgnoreCase("edge")) {

			WebDriverManager.edgedriver().setup();

			driver = new EdgeDriver();

		} else if (browserType.equalsIgnoreCase("firefox")) {

			WebDriverManager.firefoxdriver().setup();

			driver = new FirefoxDriver();

		}
		
		else {
			
			System.out.println("invalid browser selection");
		}
		
		return driver;

	}

	public static void chr() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
	}
	
	
	public static void mm() {
		
		driver.manage().window().maximize();
	
		
	}
	
	
	public static void url(String urlName) {
		
		driver.get(urlName);
	}
	
	
	public static void title() {
		
		driver.getTitle();
	}
	
	
	public static void textBox(WebElement element,String value) {
		
		element.clear();
		
		element.sendKeys(value);
	}
	
	public static void klick(WebElement element) {
		
		element.click();
		
		
	}
	
	public static void ss(String ssname) throws IOException {
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File from = ts.getScreenshotAs(OutputType.FILE);
		
		File to = new File("C:\\Users\\prabu\\eclipse-workspace\\Project_7AM\\Evidence\\"+ssname+".png");
		
		FileUtils.copyFile(from, to);
	}
	
	
	public static void imp(int sec) {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
	}
	
	
	public static void sleep(int time) {
		
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
