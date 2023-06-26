package org.Capstone.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {

	
	WebDriver driver;
	public LogInPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "email")
	public WebElement  email;
	
	@FindBy(name = "password")
	public WebElement  password;
	
	@FindBy(xpath = "//*[@id=\"form\"]/div/div/div[1]/div[1]/form/button")
	public WebElement  button;
	
	@FindBy(xpath = "//a[@href='/delete_account']")
	public WebElement DeleteAccount;
	
	public void LogInValues()
	{
		
		
		
		email.sendKeys("amisha23@gmail.com");
		password.sendKeys("Amisha23");
		
		button.click();
		DeleteAccount.click();
		
		
	}
}
