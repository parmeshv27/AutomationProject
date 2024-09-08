package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderPage {
	public WebDriver driver;
	
	public OrderPage(WebDriver driver) {
		this.driver=driver;
	}
	
	By orderSuccess=By.xpath("//*[text()='Your order has been placedâœ…']");
	
	public boolean orderSuccessMessageIsDisplayed() {
	boolean	success=driver.findElement(orderSuccess).isDisplayed();
	return success;
	}
	
	

}
