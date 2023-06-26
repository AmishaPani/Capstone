package org.Capstone.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupLoginPage {
	WebDriver driver;

	public SignupLoginPage(WebDriver driver) {
										
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "name")
	public WebElement  name;
	
	@FindBy(xpath = "//input[@data-qa='signup-email']")
	public WebElement  Email;
	
	@FindBy(xpath = "//button[normalize-space()='Signup']")
	public WebElement  button;
	
	public void signupValues()
	{
		
		name.sendKeys("Amisha");
		
		Email.sendKeys("amisha@gmail.com");
		
		button.click();
		
		
	}
	
	

     

}
