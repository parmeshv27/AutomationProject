package utils;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import pageObjects.CartPage;

public class Hooks {
	
	public WebDriver driver;
	TestSetup testsetup;
	
	public Hooks(TestSetup testsetup){
		this.testsetup=testsetup;
	}
	
	@After
	
	public void quiteDriver(){
		driver.quit();
	}

}
