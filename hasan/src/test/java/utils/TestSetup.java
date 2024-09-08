package utils;

import org.openqa.selenium.WebDriver;

import pageObjects.PageObjectManager;

public class TestSetup {
	public WebDriver driver;
	public TestBase testbase;
	public PageObjectManager pageobjectmanager;
	
	public TestSetup() throws Throwable{
		testbase=new TestBase();
		pageobjectmanager=new PageObjectManager(testbase.webDriverManager());
	}
	

}
