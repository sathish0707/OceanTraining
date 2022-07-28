package edu.Automationlearning;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleFrame {
	@Test
	public void FrameMethod() 	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/guru99home/");
		driver.switchTo().frame("a077aa5e");
		WebElement frame1 = driver.findElement(By.id("a077aa5e"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("html/body/a/img")).click();
	    driver.switchTo().defaultContent();
		driver.switchTo().parentFrame();
	}	
}
