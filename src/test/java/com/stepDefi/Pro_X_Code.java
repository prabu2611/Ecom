package com.stepDefi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Pro_X_Code {

	public static WebDriver driver;

	@Given("You are enter the Login Page")
	public void youAreEnterTheLoginPage() {

		System.out.println("Enter the Login Page");

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://adactinhotelapp.com/");

	}

	@When("You give the correct username as {string}")
	public void youGiveTheCorrectUsernameAs(String uname) {

		driver.findElement(By.id("username")).sendKeys(uname);

		// System.out.println("Username: "+uname);

	}

	@When("You give the correct password as {string}")
	public void youGiveTheCorrectPasswordAs(String pword) {

		driver.findElement(By.id("password")).sendKeys(pword);

		// System.out.println("Password: "+pword);

	}

//	@When("You give the correct username")
//	public void youGiveTheCorrectUsername() {
//		
//		System.out.println("Username : prabu2611");
//
//	}
//
//	@When("You give the correct password")
//	public void youGiveTheCorrectPassword() {
//		
//		System.out.println("Password : chenu@123");
//
//	}

	@Then("You enter the valid login details")
	public void youEnterTheValidLoginDetails() {

		driver.findElement(By.id("login")).click();
		System.out.println("You enter the valid login details");
	}

	@When("You give the incorrect username as {string}")
	public void youGiveTheIncorrectUsernameAs(String uname) {
		driver.findElement(By.id("username")).sendKeys(uname);
	}

	@When("You give the incorrect password as {string}")
	public void youGiveTheIncorrectPasswordAs(String pword) {
		driver.findElement(By.id("password")).sendKeys(pword);
	}

	@Then("You enter the invalid login details")
	public void youEnterTheInvalidLoginDetails() {
		driver.findElement(By.id("login")).click();
		System.out.println("You enter the invalid login details");
	}

}
