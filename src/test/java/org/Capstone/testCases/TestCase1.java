package org.Capstone.testCases;

import java.net.MalformedURLException;

import org.Capstone.GridConfiguration;
import org.Capstone.pageObjects.AccountInformationPage;
import org.Capstone.pageObjects.HomePage;
import org.Capstone.pageObjects.SignupLoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestCase1 extends GridConfiguration{
	
	public HomePage homeObj;
	public SignupLoginPage signuploginObj;
	public AccountInformationPage accountinformationObj;
	WebDriver driver;

	

	@Parameters({"Port"})
	@BeforeClass
	
	
	
	public void setup1(String Port) throws MalformedURLException{
		
		driver=setUp(Port);
		homeObj = new HomePage(driver);
		signuploginObj = new SignupLoginPage(driver);
		accountinformationObj = new AccountInformationPage(driver);

	}

	
	@Test
	public void scenario1(){
		homeObj.HomePageNavigation(); 
		signuploginObj.signupValues();
		accountinformationObj.AccountInformationValues();
	}


}
