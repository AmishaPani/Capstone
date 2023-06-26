package org.Capstone.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AccountInformationPage {
	WebDriver driver;// base class reference
	
	

	public AccountInformationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "password")
	public WebElement  password;
	
	@FindBy(name = "newsletter")
	public WebElement  newsletter;
	
	@FindBy(id = "optin")
	public WebElement  optin;
	
	@FindBy(id = "first_name")
	public WebElement first_name;
	
	@FindBy(id = "last_name")
	public WebElement last_name;
	
	@FindBy(id = "company")
	public WebElement company;
	
	@FindBy(id = "address1")
	public WebElement address1;
	
	@FindBy(id = "address2")
	public WebElement address2;
	
	@FindBy(id = "country")
	public WebElement country;
	
	@FindBy(id = "state")
	public WebElement state;
	
	@FindBy(id = "city")
	public WebElement city;
	
	@FindBy(id = "zipcode")
	public WebElement zipcode;
	
	@FindBy(id = "mobile_number")
	public WebElement mobile_number;
	
	@FindBy(xpath = "//*[text()='Create Account']")
	public WebElement CreateAccount;
	
	@FindBy(xpath = "//*[text()='Continue']")
	public WebElement Continue;
	
	@FindBy(xpath = "//a[@href='/delete_account']")
	public WebElement DeleteAccount;
	
	@FindBy(xpath = "//*[@id=\"form\"]/div/div/div/div/a")
	public WebElement ContinueHome;

	@FindBy(id = "days")
	public WebElement DropDowndd;
	
	@FindBy(id = "months")
	public WebElement DropDownmonth;
	
	@FindBy(id = "years")
	public WebElement DropDownyears;
	
	

	public void AccountInformationValues() {
		
		password.sendKeys("Amisha");
		
		
		Select selectdd = new Select(DropDowndd);
		selectdd.selectByValue("1");
		
	    Select selectmonth = new Select(DropDownmonth);
		selectmonth.selectByValue("1");
		
		Select selectyears = new Select(DropDownyears);
		selectyears.selectByValue("2000");
		
		newsletter.click();
		optin.click();
		first_name.sendKeys("Amisha");
		last_name.sendKeys("Pani");
		company.sendKeys("Axis");
		address1.sendKeys("Balasore");
		address2.sendKeys("Odisha");
		country.click();
		state.sendKeys("Odisha");
		city.sendKeys("Balasore");
		zipcode.sendKeys("756262");
		mobile_number.sendKeys("9876543210");
		CreateAccount.click();
		Continue.click();
		
		DeleteAccount.click();
		
		ContinueHome.click();
	}

}
