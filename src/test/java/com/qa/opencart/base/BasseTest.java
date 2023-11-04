package com.qa.opencart.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.qa.opencart.factory.DrriverFactory;
import com.qa.opencart.pages.LoginPage;

public class BasseTest {
	
	DrriverFactory df;
	WebDriver driver;
	protected LoginPage logiinpage;
	
	@BeforeTest
	public void setup() {
		df = new DrriverFactory();
		driver = df.initDriver("chrome");
		logiinpage = new LoginPage(driver);
		
	}
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
