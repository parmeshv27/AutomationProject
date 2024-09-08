package stepDefination;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginstepDefiantion {
	
	public WebDriver driver;
	
	@Given("Launch the browser")
	public void launch_the_browser() {
		System.setProperty("webdriver.chrome.driver", "D:\\Batch6\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		driver=new ChromeDriver();		
		driver.get("https://demoqa.com/login");
		driver.manage().window().maximize();		
		System.out.println("Launched the browser");
		
	}
	@When("Enter the username and password")
	public void enter_the_username_and_password() throws InterruptedException {
		driver.findElement(By.id("userName")).sendKeys("nandi1237");
		driver.findElement(By.id("password")).sendKeys("nandi123$");
		Thread.sleep(8000);	
		
	}
	@When("Click on Login button")
	public void click_on_login_button() {
		
		driver.findElement(By.id("login")).click();
	}
		
	@When("I enter Username as {string} and Password as {string}")
	public void i_enter_username_as_and_password_as(String usr, String pwd) throws InterruptedException {
		
		driver.findElement(By.id("userName")).sendKeys(usr);
	      driver.findElement(By.id("password")).sendKeys(pwd);
	      Thread.sleep(4000);	
	      driver.findElement(By.id("login")).click();
	}
	@Then("Verify login is successful")
	public void verify_login_is_successful() throws InterruptedException {
		Thread.sleep(7000);	
		boolean val2 = driver.findElement(By.xpath("//*[text()='Invalid username or password!']")).isDisplayed();
	
if(val2==true) {
	System.out.println("test is pass");
}
else {
	System.out.println("test is failed");
}
driver.quit();
	}
	
}
