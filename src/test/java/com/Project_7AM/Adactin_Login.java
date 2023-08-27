package com.Project_7AM;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.baseclassmethods.BaseClass7AM;
import com.hiddenfile.FileRead;
import com.pompojo.Adactin_All_Page;
import com.pompojo.Adactin_Login_Page;

public class Adactin_Login extends BaseClass7AM {

	
	
	public static void login() throws IOException {
		
		browserLanuch("chrome");
		
		mm();
		
		url(FileRead.FileReadManager().ConfigRead().getUrl());
		
		Adactin_All_Page pom = new Adactin_All_Page(driver);
		
		textBox(pom.getAlp().getUsername(), FileRead.FileReadManager().ConfigRead().getUsername());
		
		textBox(pom.getAlp().getPassword(), FileRead.FileReadManager().ConfigRead().getPassword());
		
		klick(pom.getAlp().getSubmit());
		
		
		
		
		
		
		

	}	

	public static void main(String[] args) throws IOException {

		login();
	}

}
