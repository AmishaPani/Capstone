package org.Capstone.testCases;

import java.net.MalformedURLException;

import org.Capstone.GridConfiguration;
import org.Capstone.pageObjects.ViewPages;
import org.Capstone.pageObjects.ReviewPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestCase6 extends GridConfiguration{
	
	public ViewPages viewObj;
	public ReviewPage ReviewObj;
	
	WebDriver driver;

	
	
	@Parameters({"Port"})
	@BeforeMethod
	
	
	public void setup1(String Port) throws MalformedURLException {
		driver=setUp(Port);
		viewObj = new ViewPages(driver);
		ReviewObj = new ReviewPage(driver);
		 
	}

	
	@Test
	public void scenario1(){
		viewObj.HomePageNavigations();
		
		ReviewObj.ViewPageNavigation() ;
	}

}
