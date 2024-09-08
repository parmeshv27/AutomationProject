package stepDefination;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import pageObjects.OrderPage;
import utils.TestSetup;

public class OrderPagestepDefination {
	public WebDriver driver;
	TestSetup testsetup;
    OrderPage orderPage;
    
    public OrderPagestepDefination(TestSetup testsetup) {
    	this.testsetup=testsetup;
    	this.orderPage=testsetup.pageobjectmanager.getorderPage();
    }
    

    @Then("Verify order is success")
    public void verify_order_is_success() {
    	System.out.println("User is verifying the order is success");
    	boolean success=orderPage.orderSuccessMessageIsDisplayed();
    	Assert.assertTrue("Oder is not success", success);
    }



    
}
