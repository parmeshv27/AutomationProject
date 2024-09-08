package stepDefination;

import io.cucumber.java.After;
import utils.TestSetup;

public class Hooks {
	TestSetup testsetup;
	public Hooks(TestSetup testsetup){
		this.testsetup=testsetup;		
	}
	
	@After
public void	quiteDriver() throws Throwable{
	System.out.println("Closing the browser and driver instance");
	testsetup.testbase.webDriverManager().quit();
	}

}
