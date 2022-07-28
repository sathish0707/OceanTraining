package edu.Automationlearning;

import java.time.Duration;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleWindow {
	
	@Test
	
	public void Handlewindow() 		{
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.manage().window().maximize();
	driver.get("https://www.naukri.com/");
	String baseWindow = driver.getWindowHandle();
	System.out.println("Base Window Name "+ baseWindow);
	driver.findElement(By.xpath("//div[text()='Register']")).click();
	Set<String> windowNameList = driver.getWindowHandles();
	for (String winName : windowNameList)
	{
		System.out.println("Inside for loop  ::"+ winName);
		if(!winName.equalsIgnoreCase(baseWindow))
		{
			driver.switchTo().window(winName);
		}
	}

	String headerValue = driver.findElement(By.xpath("//h1[@class='global-title-1']")).getText();
	System.out.println("Header Value:: " +headerValue);
	}
}
