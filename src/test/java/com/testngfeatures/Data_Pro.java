package com.testngfeatures;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Data_Pro {

//	int num[]= {10,20,30,40};
//	
//	int number[]=new int[4];
//	
//	number[0]=10;

//	String[][] data = {
//
//			// multiset of data
//			{ "prabu2611", "chenu@123" }, { "sara", "329894028" }, { "vijay", "jhfwiw7979" }, { "farz", "hwifhil" },
//			{ "ajith", "wkhiof9" }, { "pradeep", "psjkdgks" }
//
//	};

	@DataProvider(name = "Login Values")
	public String[][] loginData() throws IOException {
		
		String[][] data = ExcelData.ReadData();

		return data;

	}

	@Test(dataProvider = "Login Values")
	public void login(String uname, String pword) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://adactinhotelapp.com/");

		driver.findElement(By.id("username")).sendKeys(uname);

		driver.findElement(By.id("password")).sendKeys(pword);

		driver.findElement(By.id("login")).click();

	}

}
