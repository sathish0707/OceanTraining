package edu.Automationlearning;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ajioCharCount {

	@Test
	public void Customer() throws InterruptedException
	{
	WebDriverManager.chromedriver().setup();
	ChromeOptions option = new ChromeOptions();
	option.addArguments("--disable-notifications");
	WebDriver driver = new ChromeDriver(option);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	driver.manage().window().maximize();
	driver.get("https://www.ajio.com/");
		
	WebElement Gender = driver.findElement(By.xpath("//a[@title='WOMEN']"));
	Actions action = new Actions(driver);
	action.moveToElement(Gender).build().perform();
	
	WebElement brand = driver.findElement(By.linkText("BRANDS"));
	action.moveToElement(brand).build().perform();
	List<WebElement> ele = driver.findElement(By.xpath("//a[contains(text(),'BRANDS')]"));
	
}
}
