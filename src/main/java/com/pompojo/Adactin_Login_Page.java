package com.pompojo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclassmethods.BaseClass7AM;

public class Adactin_Login_Page{
	
	public static WebDriver driver;

	//POM -> Page Object Manager
	
	//POJO -> Plain Old Java Object  -> Class + Variable => method
	
	//@FindBy(att.name="att.value")
	
	//Page Factory -> 
	
	@FindBy(id="username")
	private WebElement username;
	
	@FindBy(id="password")
	private WebElement password;
		
	@FindBy(id="login")
	private WebElement submit;
	
	public Adactin_Login_Page(WebDriver driver) {
		
		this.driver=driver;
		
		PageFactory.initElements(driver,this);
		
	}


	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSubmit() {
		return submit;
	}

	
}
