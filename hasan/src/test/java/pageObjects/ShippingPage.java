package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShippingPage {
	
	public WebDriver driver;
	
	public ShippingPage(WebDriver driver) {
		this.driver=driver;
	}
	
	By address=By.id("address");	
  public void enterAddress(String inputAddress) {
	  driver.findElement(address).sendKeys(inputAddress);
  }
  
  By cashOnDeliver=By.xpath("//*[text()='Cash On Delivery']");  
  public void clickOnCheckboxCashOnDeliver() {
	  driver.findElement(cashOnDeliver).click();
  }
  
  By placeOrder=By.id("place_order");
  public void clickOnplaceOrder() {
	  driver.findElement(placeOrder).click();
  }
  

}
