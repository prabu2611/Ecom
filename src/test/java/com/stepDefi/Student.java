package com.stepDefi;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Student {
	@Given("Student Submit School Marksheet")
	public void student_submit_school_marksheet() {
	   System.out.println("Student Submit School Marksheet");
	}

	
	@Given("Student Bio Mark")
	public void student_bio_mark() {
	    System.out.println("Student Bio Mark");
	}

	@When("Student Pass the Neet Exam")
	public void student_pass_the_neet_exam() {
	    System.out.println("Student Pass the Neet Exam");
	}

	@Then("Student Admission in the Medical College")
	public void student_admission_in_the_medical_college() {
	  System.out.println("Student Admission in the Medical College");
	}

	@Given("Student Maths Mark")
	public void student_maths_mark() {
	   System.out.println("Student Maths Mark");
	}

	@When("Student needs cut off marks")
	public void student_needs_cut_off_marks() {
	   System.out.println("Student needs cut off marks");
	}

	@Then("Student Admission in the Engineering College")
	public void student_admission_in_the_engineering_college() {
	   System.out.println("Student Admission in the Engineering College");
	}

}
