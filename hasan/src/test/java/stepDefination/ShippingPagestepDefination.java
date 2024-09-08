package stepDefination;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.When;
import pageObjects.ShippingPage;
import utils.TestSetup;

public class ShippingPagestepDefination {
	public WebDriver driver;
	TestSetup testsetup;
	ShippingPage shippingPage;
	
	public ShippingPagestepDefination(TestSetup testsetup) {
		this.testsetup=testsetup;
		this.shippingPage=testsetup.pageobjectmanager.getshippingPage();
	}
	
	@When("Enter the {string} address")
	public void enter_the_address(String address) {
		shippingPage.enterAddress(address);
		
	}
	@When("Click on Cash on Delivery and Place Order")
	public void click_on_cash_on_delivery_and_place_order() throws InterruptedException {
		shippingPage.clickOnCheckboxCashOnDeliver();
		Thread.sleep(5000);
		shippingPage.clickOnplaceOrder();
		Thread.sleep(5000);
	}
	
	
	

}
