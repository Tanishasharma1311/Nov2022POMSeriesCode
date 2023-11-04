package com.qa.opencart.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DrriverFactory {
	
	
	public WebDriver driver;
	
	public WebDriver initDriver(String browserName) {
		System.out.println("browser name is :" + browserName);
		
		if(browserName.trim().equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		else if(browserName.trim().equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		else if(browserName.trim().equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
		else {
			System.out.println("pls pass the right browser...." + browserName);
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		return driver;
		
	}

}
