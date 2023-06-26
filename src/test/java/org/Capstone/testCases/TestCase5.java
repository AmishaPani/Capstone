package org.Capstone.testCases;

import java.net.MalformedURLException;

import org.Capstone.GridConfiguration;
import org.Capstone.pageObjects.ProductPage;
import org.Capstone.pageObjects.SearchPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestCase5 extends GridConfiguration{
	
	public ProductPage ProductObj;
	public SearchPage SearchObj;
	
	WebDriver driver;

	
	
	@Parameters({"Port"})

	@BeforeMethod
	
	public void setup1(String Port) throws MalformedURLException{
		
		driver=setUp(Port);

		ProductObj = new ProductPage(driver);
		 SearchObj = new SearchPage(driver);
		 
	}

	
	@Test
	public void scenario1(){
		ProductObj.HomePageNavigation();
		
	}
}
