package com.hasan.hasan;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v125.security.Security;

public class HandleSecurityCertificates {
	static WebDriver driver;
	static DevTools devTools;
	
	public static void main(String[] args) throws InterruptedException {
		
//		WebDriveManager.chromeDriver().setup();
		
System.setProperty("webdriver.driver.chrome", "D://Batch6//hasan//drivers//chromedriver.exe");
		
		 driver=new ChromeDriver();
		 devTools=((ChromeDriver)driver).getDevTools();
		 driver.get("https://expired.badssl.com/");
		 Thread.sleep(2000);
		 
		 devTools.send(Security.enable());
		 devTools.send(Security.setIgnoreCertificateErrors(true));
		 driver.get("https://expired.badssl.com/");
		 Thread.sleep(2000);
		 driver.quit();
		 
		
	}

}
