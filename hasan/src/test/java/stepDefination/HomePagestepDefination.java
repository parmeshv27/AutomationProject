package stepDefination;


import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.CartPage;
import pageObjects.HomePage;
import utils.TestSetup;

public class HomePagestepDefination {
	
	
	public  WebDriver driver;
	 TestSetup testsetup;
	 HomePage homePage;
	 CartPage cartPage;
	public HomePagestepDefination(TestSetup testsetup){
		this.testsetup=testsetup;
		 this.homePage=testsetup.pageobjectmanager.getHomePage();
		 this.cartPage=testsetup.pageobjectmanager.getCartPage();
		 
	}
	

@Given("Launch the home page")
public void launch_the_home_page() {
	System.out.println("Home page is opened");
}

@Then("I Verify {string} link on the headers")
public void i_verify_link_on_the_headers(String linkName) {
	System.out.println("Test Data : " + linkName);
//	HomePage	homePage=new HomePage(driver);	
    boolean homeLink = homePage.headerLinkIsDisplayed();
    
    Assert.assertTrue("Link name is not available" + linkName, homeLink);	
}

@Then("Verify {string} product name is displayed")
public void verify_product_name_is_displayed(String expectedproductName) {
	System.out.println("Expected product Name is :" + expectedproductName);
	String actualProductName=homePage.getProductName();
	System.out.println("Actual ProductName is :" + actualProductName);
	
	Assert.assertEquals("Product Name is not matched: " +expectedproductName, expectedproductName, actualProductName);
	
}

@When("Add the product to the cart")
public void add_the_product_to_the_cart() throws InterruptedException {
	System.out.println("Click on the add to cart ");
	homePage.addToCartProdct();
	Thread.sleep(5000);
}
@Then("Verify product is added to the cart")
public void verify_product_is_added_to_the_cart() throws InterruptedException {
	System.out.println("Verifying the product is added to the cart");	
	
	boolean productstatus=cartPage.productNameIsDisplayed();
	System.out.println("Product displayed status: " + productstatus);
	Assert.assertTrue("Tomato name is not displayed", productstatus);
	
}

@When("Open the cart page")
public void open_the_cart_page() throws InterruptedException {
	homePage.clickOnCartLink();
	Thread.sleep(5000);
}


}
