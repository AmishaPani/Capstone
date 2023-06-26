package org.Capstone.pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReviewPage {
WebDriver driver;
	
    public ReviewPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "name")
	public WebElement Name;
	
	@FindBy(id = "email")
	public WebElement Email;
	
	
	@FindBy(id = "review")
	public WebElement Review;
	
	@FindBy(id = "button-review")
	public WebElement Submit;
	
	public void ViewPageNavigation() {
	     Name.sendKeys("Amisha");
	     Email.sendKeys("amisha@gmail.com");
			
	     Review.sendKeys("Good");
	     Submit.click();

		}

	


}
