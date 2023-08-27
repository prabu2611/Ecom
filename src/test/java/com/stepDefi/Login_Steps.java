package com.stepDefi;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_Steps {

	@Given("User Enter the Sample Project Login Page")
	public void user_enter_the_sample_project_login_page() {
		System.out.println("User Enter the Sample Project Login Page");

	}

	@When("User gives username as {string}")
	public void user_gives_username_as(String uname) {
		System.out.println("Username: " + uname);
	}

	@And("User gives password as {string}")
	public void user_gives_password_as(String pword) {
		System.out.println("Password : " + pword);
	}

	@Then("User Click the Sumbit button")
	public void user_click_the_sumbit_button() {

		System.out.println("User Click the Sumbit button");

	}

}
