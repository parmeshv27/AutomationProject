package com.hasan.hasan;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SecurityCertificate {
	
	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.driver.chrome", "D://Batch6//hasan//drivers//chromedriver.exe");
		
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--ignore-certificate-errors");
		
		WebDriver driver=new ChromeDriver(options);
//		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		options.addArguments("--start-maximized"); // Start browser maximized		

		 driver.get("https://expired.badssl.com/");
		 Thread.sleep(5000);
		 
		 driver.get("https://expired.badssl.com/");
		 driver.quit();
	}


}
