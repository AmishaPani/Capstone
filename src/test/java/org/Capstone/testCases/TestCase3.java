package org.Capstone.testCases;

import java.net.MalformedURLException;

import org.Capstone.GridConfiguration;
import org.Capstone.pageObjects.HomePage;
import org.Capstone.pageObjects.LogInPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

 public class TestCase3 extends GridConfiguration{
	
	public HomePage homeObj;
	public LogInPage LoginObj;
	
	WebDriver driver;

	
	
	@Parameters({"Port"})
	@BeforeMethod
	
	
	public void setup1(String Port) throws MalformedURLException{
		
		driver=setUp(Port);
		homeObj = new HomePage(driver);
		 LoginObj = new LogInPage(driver);
		

	}

	
	@Test
	public void scenario1(){
		homeObj.HomePageNavigation();
		LoginObj.LogInValues();
		
	}

}
