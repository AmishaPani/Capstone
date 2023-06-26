package org.Capstone.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginValuePage {
	
	WebDriver driver;

	public LoginValuePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);	}

	@FindBy(name = "email")
	public WebElement  email;
	
	@FindBy(name = "password")
	public WebElement  password;
	
	@FindBy(xpath = "//*[@id=\"form\"]/div/div/div[1]/div[1]/form/button")
	public WebElement  button;
	
	@FindBy(xpath = "//a[@href='/delete_account']")
	public WebElement DeleteAccount;
	
	public void LoginValues()
	{
		
		
		
		email.sendKeys("ap@gmail.com");
		password.sendKeys("ap123");
		
		button.click();
		DeleteAccount.click();
		
		
	}
	
	@FindBy(xpath = "//b[normalize-space()='Enter Account Information']")
	
	WebElement account;
	
	
	public void informationVisible()
	{
		
		System.out.println("Enter Account Information is Visible - "+account.isDisplayed());
		
		Assert.assertTrue(account.isDisplayed(), "Account Information is  Not Visible ");
		
		
	}

}
