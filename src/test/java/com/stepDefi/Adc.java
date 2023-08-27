package com.stepDefi;

import org.openqa.selenium.WebDriver;

import com.baseclassmethods.BaseClass7AM;
import com.pompojo.Adactin_All_Page;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Adc extends BaseClass7AM{
	
	
	@Given("Go to Adc Website")
	public void go_to_adc_website() {
		
		browserLanuch("chrome");
		
		mm();
		
		url("https://adactinhotelapp.com/");
	    
	}

	@When("Users give username as {string} in adc")
	public void users_give_username_as_in_adc(String uname) {
		
		Adactin_All_Page pom = new Adactin_All_Page(driver);
		
		textBox(pom.getAlp().getUsername(),uname);
	   
	}

	@When("Users give password as {string} in adc")
	public void users_give_password_as_in_adc(String pword) {
		Adactin_All_Page pom = new Adactin_All_Page(driver);
		
		textBox(pom.getAlp().getPassword(), pword);
		
	    
	}

	@Then("User subnit the login in adc")
	public void user_subnit_the_login_in_adc() {
		
		Adactin_All_Page pom = new Adactin_All_Page(driver);
		
		klick(pom.getAlp().getSubmit());
	 
	}

}
