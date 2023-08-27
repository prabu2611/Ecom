package com.pompojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Adactin_All_Page {
	
	public static WebDriver driver;
	
	private Adactin_Login_Page alp;
	
	
	public Adactin_All_Page(WebDriver driver) {
		
		this.driver=driver;
		
		PageFactory.initElements(driver,this);
		
	}


	

	public static WebDriver getDriver() {
		return driver;
	}


	public Adactin_Login_Page getAlp() {
		
		alp= new Adactin_Login_Page(driver);
		
		return alp;
	}

}
