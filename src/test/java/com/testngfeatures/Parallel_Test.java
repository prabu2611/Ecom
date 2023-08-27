package com.testngfeatures;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parallel_Test {

	// Sequence

	@Test
	public void meth1() {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://adactinhotelapp.com/");

		System.out.println(Thread.currentThread().getId());
	}

	@Test
	public void meth2() {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");

		System.out.println(Thread.currentThread().getId());
	}

	@Test
	public void meth3() {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");

		System.out.println(Thread.currentThread().getId());
	}

}
