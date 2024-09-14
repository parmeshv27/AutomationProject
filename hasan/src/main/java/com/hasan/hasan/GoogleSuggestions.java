package com.hasan.hasan;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSuggestions {

	public static void main(String[] args) {

		WebDriver	driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("Param");
		List<WebElement>	suggestions=driver.findElements(By.xpath("//ul//li[@data-view-type='1']"));
		System.out.println(suggestions.size());
		ArrayList<String> list=new ArrayList<String>();
		for( WebElement s:suggestions) {
			list.add(s.getText());
		}

		System.out.println("Before sort:" + list);
		Collections.sort(list);
		System.out.println("After sort:" + list);
		//Click on Third options
		driver.findElement(By.xpath("//ul//li[@data-view-type='1'][3]")).click();
		driver.quit();
	}

}
