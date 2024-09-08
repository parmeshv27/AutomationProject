package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeDriverInfo;

public class TestBase {
	
	public WebDriver driver;
	
public	WebDriver webDriverManager() throws Throwable    {
	
FileInputStream	 file=new FileInputStream(System.getProperty("user.dir") +"\\src\\test\\resources\\config.properties");		
   Properties prop = new Properties();
   prop.load(file);
     String qaurl=prop.getProperty("qaurl");  
	System.out.println("QA Url is " + qaurl);
     String browserType=prop.getProperty("browserType");
     String envType=prop.getProperty("environmentType");
     
     if(driver==null) {
    	if(browserType.equalsIgnoreCase("chrome")) {
    		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe" );
    		
    		ChromeOptions options = new ChromeOptions();
    		options.addArguments("--remote=allow=origins=*");
    		driver=new ChromeDriver();
    		
    	}
    	
    	if(browserType.equalsIgnoreCase("edge")) {
    		System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"\\drivers\\msedgedriver.exe" );    		
    		driver=new EdgeDriver();
    		
    	}
    	
    	if(browserType.equalsIgnoreCase("firefox")) {
    		System.setProperty("webdriver.firefox.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe" );
    		
//    		driver=new fir
    	}
    	
    	if(envType.equalsIgnoreCase("qa")) {
    		driver.get(qaurl);
    	}
    	
    	if(envType.equalsIgnoreCase("pre")) {
    		driver.get(qaurl);
    	}
    	
    	if(envType.equalsIgnoreCase("prod")) {
    		driver.get(qaurl);
    	}
    	
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
    	 
    	
    	
     }
     return driver;
	}
	

}
