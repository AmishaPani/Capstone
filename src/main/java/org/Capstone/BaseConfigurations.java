package org.Capstone;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseConfigurations {
	
	public WebDriver getDriver() {

		System.setProperty("webdriver.chrome.driver", "C:/Users/acer/Desktop/Amisha/ami/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://automationexercise.com/");
		driver.manage().window().maximize();
		return driver;
		
		
		

	}

}
