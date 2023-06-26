package org.Capstone.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginUserPage {
	
	WebDriver driver;
	
    public LoginUserPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "/html/body/header/div/div/div/div[2]/div/ul/li[4]/a")
	public WebElement  SignupLogin;

	public void HomePageNavigation() {
		
		SignupLogin.click();
		

	}

}
