package org.Capstone.testCases;

import java.net.MalformedURLException;

import org.Capstone.GridConfiguration;
import org.Capstone.pageObjects.CartPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestCase4 extends GridConfiguration{
	
	public CartPage cartObj;
	
	WebDriver driver;

	
	
	@Parameters({"Port"})
	@BeforeMethod
	
	
	public void setup1(String Port) throws MalformedURLException{
		driver=setUp(Port);
		cartObj = new CartPage(driver);
		 
	}

	
	@Test
	public void scenario1(){
		cartObj.HomePageAddtocart();
		
	}


}
 