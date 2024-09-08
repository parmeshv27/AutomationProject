package stepDefination;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.CartPage;
import utils.TestSetup;

public class CartPagestepDefination {
	public WebDriver driver;
	TestSetup testsetup;
	CartPage cartPage;
	
	public CartPagestepDefination(TestSetup testsetup){
		this.testsetup=testsetup;
		this.cartPage=testsetup.pageobjectmanager.getCartPage();
	}
	
	@Then("Verify remove button")
	public void verify_remove_button() {
		boolean removeButton=cartPage.removeButtonIsAvailable();
		System.out.println("Remove button status :  " +removeButton );
		Assert.assertTrue("Remove button is not available", removeButton);
		
	}
	
	@Then("Verify total price")
	public void verify_total_price() {
		System.out.println("Verified the price");
	}
	
	@When("Click on Proceed to Checkout")
	public void click_on_proceed_to_checkout() {
		System.out.println("Click on proceed to checkout ");
		cartPage.clickOnProceedToCheckout();
	}
}
