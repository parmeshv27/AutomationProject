package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class  CartPage{
	
	public WebDriver driver;
	
	public CartPage(WebDriver driver){
		this.driver=driver;
	}
	
	By tomatoName=By.xpath("//*[text()='Tomato(Fresh)']");
	
	public boolean productNameIsDisplayed() {
		boolean v2=driver.findElement(tomatoName).isDisplayed();
		return v2;
	}
	
	By proceedToCheckout=By.linkText("Proceed to Checkout");
	
	public void clickOnProceedToCheckout()
	{
		driver.findElement(proceedToCheckout).click();
	}
	
	By removeButton=By.xpath("//span[@class='btn btn-danger remove-item']");
	
	public boolean removeButtonIsAvailable() {
		boolean remove=driver.findElement(removeButton).isDisplayed();
		return remove;
	}
	
	public void test(){
		
		Select sel=new Select((WebElement) tomatoName);
		
	
	}
}
