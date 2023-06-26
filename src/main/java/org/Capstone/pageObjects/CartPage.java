package org.Capstone.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	
WebDriver driver;
	
    public CartPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		

	}

	@FindBy(xpath = "/html/body/section[2]/div/div/div[2]/div[1]/div[2]/div/div[1]/div[1]")
	public WebElement  BlueTop;
	
	@FindBy(xpath = "/html/body/section[2]/div/div/div[2]/div[1]/div[2]/div/div[1]/div[2]/div/a")
	public WebElement  Addtocart1;

	@FindBy(xpath = "//*[@id=\"cartModal\"]/div/div/div[3]/button")
	public WebElement  ContinueShopping1;

	
	@FindBy(xpath = "/html/body/section[2]/div/div/div[2]/div[1]/div[3]/div/div[1]/div[1]")
	public WebElement  MenTshirt;
	
	@FindBy(xpath = "/html/body/section[2]/div/div/div[2]/div[1]/div[3]/div/div[1]/div[2]/div/a")
	public WebElement  Addtocart2;

	@FindBy(xpath = "//*[@id=\"cartModal\"]/div/div/div[3]/button")
	public WebElement  ContinueShopping2;
	
	@FindBy(xpath = "/html/body/section[2]/div/div/div[2]/div[1]/div[4]/div/div[1]/div[1]")
	public WebElement  Dress1;
	
	@FindBy(xpath = "/html/body/section[2]/div/div/div[2]/div[1]/div[4]/div/div[1]/div[2]/div/a")
	public WebElement  Addtocart3;

	@FindBy(xpath = "//*[@id=\"cartModal\"]/div/div/div[3]/button")
	public WebElement  ContinueShopping3;
	
	@FindBy(xpath = "/html/body/section[2]/div/div/div[2]/div[1]/div[5]/div/div[1]/div[1]")
	public WebElement  Dress2;
	
	@FindBy(xpath = "/html/body/section[2]/div/div/div[2]/div[1]/div[5]/div/div[1]/div[2]/div/a")
	public WebElement  Addtocart4;

	@FindBy(xpath = "//*[@id=\"cartModal\"]/div/div/div[3]/button")
	public WebElement  ContinueShopping4;
	
	@FindBy(xpath = "/html/body/section[2]/div/div/div[2]/div[1]/div[6]/div/div[1]/div[1]")
	public WebElement  Top;
	
	@FindBy(xpath = "/html/body/section[2]/div/div/div[2]/div[1]/div[6]/div/div[1]/div[2]/div/a")
	public WebElement  Addtocart5;

	@FindBy(xpath = "//*[@id=\"cartModal\"]/div/div/div[3]/button")
	public WebElement  ContinueShopping5;
	
	@FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[3]/a")
	public WebElement  Cart;
	
	@FindBy(xpath = "//*[@id=\"product-1\"]/td[6]/a/i")
	public WebElement  Cross1;
	
	@FindBy(xpath = "//*[@id=\"product-2\"]/td[6]/a/i")
	public WebElement  Cross2;
	
	@FindBy(xpath = "//*[@id=\"product-3\"]/td[6]/a/i")
	public WebElement  Cross3;
	
	@FindBy(xpath = "//*[@id=\"product-4\"]/td[6]/a/i")
	public WebElement  Cross4;
	
	@FindBy(xpath = "//*[@id=\"product-5\"]/td[6]/a/i")
	public WebElement  Cross5;
	
	public void HomePageAddtocart() {
		
		BlueTop.click();
		Addtocart1.click();
		ContinueShopping1.click();
		MenTshirt.click();
		Addtocart2.click();
		ContinueShopping2.click();
		Dress1.click();
		Addtocart3.click();
		ContinueShopping3.click();
		Dress2.click();
		Addtocart4.click();
		ContinueShopping4.click();
		Top.click();
		Addtocart5.click();
		ContinueShopping5.click();
		Cart.click();
		Cross1.click();
		Cross2.click();
		Cross3.click();
		Cross4.click();
		Cross5.click();
		

	}

}
