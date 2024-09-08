package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	
	public WebDriver driver;
	public HomePage homePage;
	public CartPage cartPage;
	public ShippingPage shippingPage;
	public OrderPage orderPage;
	
	 public PageObjectManager(WebDriver driver){
		this.driver=driver;
	}
	
	public HomePage getHomePage(){
		HomePage	homePage=new HomePage(driver);		
		return homePage;		
	}
	
	public CartPage getCartPage(){
		CartPage	cartPage=new CartPage(driver);		
		return cartPage;		
	}
	
	public ShippingPage getshippingPage() {
		ShippingPage	shippingPage=new ShippingPage(driver);
		return shippingPage;
		
	}
	
	public OrderPage getorderPage() {
		OrderPage orderPage=new OrderPage(driver);
		return orderPage;
	}
	

}
