package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	public WebDriver driver;
	
	public HomePage(WebDriver driver){
		this.driver=driver;
	}
	
	By homeLink=By.xpath("//*[text()='Home']");	
	
	public boolean headerLinkIsDisplayed(){
		boolean v1=driver.findElement(homeLink).isDisplayed();
		return v1;		
	}
	
	By tomatoName=By.xpath("//*[text()='Tomato-1 Kg']");
	
	public String getProductName() {
	String	productName=driver.findElement(tomatoName).getText();
		return productName;
	}
	
	By addToCartTomato=By.xpath("//*[@data-name='Tomato']");
	
	public void addToCartProdct(){
		driver.findElement(addToCartTomato).click();
	}
	
	By cartLink=By.linkText("Cart");
	public void clickOnCartLink() {
		driver.findElement(cartLink).click();
	}
	
	

}
