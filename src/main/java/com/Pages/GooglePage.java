package com.Pages;

import org.openqa.selenium.By;

public class GooglePage extends BasePage{

	// page actions
	public void googleSearchTest() {
		
		driver.findElement(By.xpath("//input[@id='input']")).clear();
		driver.findElement(By.xpath("//input[@id='input']")).sendKeys("Canada");
		driver.findElement(By.xpath("//input[@id='input']")).submit();
		
		driver.findElements(By.xpath("//h3")).stream().forEach(ele -> System.out.println(ele.getText()));
		
	}
	
	
	public void tearDown() {
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
}
