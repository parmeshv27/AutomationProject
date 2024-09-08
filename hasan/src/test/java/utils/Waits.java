package utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {
	public WebDriver driver;
	
	
	Waits(WebDriver driver){
		this.driver=driver;
	}
	
	
	public void fluentWait(WebElement element){
	
             new FluentWait<WebDriver>(driver)
			.withTimeout(Duration.ofSeconds(20))
			.pollingEvery(Duration.ofSeconds(4))
			.ignoring(Exception.class)
			.until(ExpectedConditions.visibilityOf(element));
	}
	
	WebElement element1=driver.findElement(By.xpath(""));
	public void webDriverWait(WebElement element1) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.invisibilityOfElementLocated((By) element1));
		
	}
	

}
