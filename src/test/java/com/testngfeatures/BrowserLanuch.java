package com.testngfeatures;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLanuch {

	static WebDriver driver;// null driver
	// login -> testcase

	@Test
	public void browser() {

		// System.setProperty("webdriver.chrome.driver", "driver.exe");

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

	}

	@Test
	public void maxi() {

		driver.manage().window().maximize();
	}

	@Test
	public void url() {

		driver.get("https://www.facebook.com/");
	}

//	@Test
//	public void browserinEdge() {
//		
//		WebDriverManager.edgedriver().setup();
//		
//		WebDriver driver = new EdgeDriver();
//		
//		driver.get("https://www.facebook.com/");
//	}

}
