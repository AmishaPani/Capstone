package org.Capstone.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	
WebDriver driver;
	
   public SearchPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	
		
	}
    


	@FindBy(name = "search")
	public WebElement Search;
	
	

	
	@FindBy(id = "submit_search")
	public WebElement button;
	
	

	@FindBy(xpath = "/html/body/section[2]/div/div/div[2]/div/div[2]/div/div[1]/div[1]")
	public WebElement  dress1;
	


	
	
	@FindBy(xpath = "/html/body/section[2]/div/div/div[2]/div/div[2]/div/div[1]/div[2]/div/a")
	public WebElement  addtocart1;
	


	
	@FindBy(xpath = "//*[@id=\"cartModal\"]/div/div/div[3]/button")
	public WebElement continue1 ;
	


	
	@FindBy(xpath = "/html/body/section[2]/div/div/div[2]/div/div[3]/div/div[1]/div[1]")
	public WebElement  dress2;
	
	

	@FindBy(xpath = "//a[@data-product-id=\"4\"]\r\n")
	 public WebElement  addtocart2;
	
	

	
	@FindBy(xpath = "//*[@id=\"cartModal\"]/div/div/div[3]/button")
	public WebElement continue2;
	
	

	@FindBy(xpath = "/html/body/section[2]/div/div/div[2]/div/div[4]/div/div[1]/div[1]")
	public WebElement  dress3;
	

	
	@FindBy(xpath = "//a[@data-product-id=\"16\"]\r\n")
	public WebElement  addtocart3;
	
	

	
	@FindBy(xpath = "//*[@id=\"cartModal\"]/div/div/div[3]/button")
	public WebElement continue3;
	

	
	@FindBy(xpath = "/html/body/section[2]/div/div/div[2]/div/div[5]/div/div[1]/div[1]")
	public WebElement  dress4;
	
	@FindBy(xpath = "//a[@data-product-id=\"19\"]\r\n")
	public WebElement  addtocart4;
	
	@FindBy(xpath = "//*[@id=\"cartModal\"]/div/div/div[3]/button")
	public WebElement continue4;
	
	@FindBy(xpath = "/html/body/section[2]/div/div/div[2]/div/div[6]/div/div[1]/div[1]")
	public WebElement  dress5;
	
	@FindBy(xpath = "//a[@data-product-id=\"20\"]\r\n")
	public WebElement  addtocart5;
	
	@FindBy(xpath = "//*[@id=\"cartModal\"]/div/div/div[3]/button")
	public WebElement continue5;
	
	@FindBy(xpath = "/html/body/section[2]/div/div/div[2]/div/div[7]/div/div[1]/div[1]")
	public WebElement  dress6;
	
	@FindBy(xpath = "/html/body/section[2]/div/div/div[2]/div/div[7]/div/div[1]/div[2]/div/a")
	public WebElement  addtocart6;
	
	@FindBy(xpath = "//*[@id=\"cartModal\"]/div/div/div[3]/button")
	public WebElement continue6;
	
	@FindBy(xpath = "/html/body/section[2]/div/div/div[2]/div/div[8]/div/div[1]/div[1]")
	public WebElement  dress7;
	
	@FindBy(xpath = "/html/body/section[2]/div/div/div[2]/div/div[8]/div/div[1]/div[2]/div/a")
	public WebElement  addtocart7;
	
	@FindBy(xpath = "//*[@id=\"cartModal\"]/div/div/div[3]/button")
	public WebElement continue7;
	
	@FindBy(xpath = "/html/body/section[2]/div/div/div[2]/div/div[9]/div/div[1]/div[1]")
	public WebElement  dress8;
	
	@FindBy(xpath = "/html/body/section[2]/div/div/div[2]/div/div[9]/div/div[1]/div[2]/div/a")
	public WebElement  addtocart8;
	
	@FindBy(xpath = "//*[@id=\"cartModal\"]/div/div/div[3]/button")
	public WebElement continue8;
	
	@FindBy(xpath = "/html/body/section[2]/div/div/div[2]/div/div[10]/div/div[1]/div[1]")
	public WebElement  dress9;
	
	@FindBy(xpath = "/html/body/section[2]/div/div/div[2]/div/div[10]/div/div[1]/div[2]/div/a")
	public WebElement  addtocart9;
	
	@FindBy(xpath = "//*[@id=\"cartModal\"]/div/div/div[3]/button")
	public WebElement continue9;
	
	@FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[3]/a")
	public WebElement  Cart;
	
	@FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")
	public WebElement  signup;
	
	@FindBy(name = "email")
	public WebElement  email;
	
	@FindBy(name = "password")
	public WebElement  password;
	
	@FindBy(xpath = "//*[@id=\"form\"]/div/div/div[1]/div[1]/form/button")
	public WebElement  Button;
	
	@FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[3]/a")
	public WebElement  Cart2;

	public void ProductPageNavigation() {
		
     Search.sendKeys("dress");
     button.click();
     dress1.click();
     addtocart1.click();
     continue1.click();
     dress2.click();
     addtocart2.click();
     continue2.click();
     dress3.click();
     addtocart3.click();
     continue3.click();
     dress4.click();
     addtocart4.click();
     continue4.click();
     dress5.click();
     addtocart5.click();
     continue5.click();
     dress6.click();
     addtocart6.click();
     continue6.click();
     dress7.click();
     addtocart7.click();
     continue7.click();
     
     dress8.click();
     addtocart8.click();
     continue8.click();
     dress9.click();
     addtocart9.click();
     continue9.click();
     Cart.click();
     signup.click();
     email.sendKeys("amisha@gmail.com");
		password.sendKeys("Amisha");
		Button.click();
     
     Cart2.click();
		

	}

}
