package edu.Automationlearning;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ajio {
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
	WebElement type = driver.findElement(By.linkText("ETHNIC WEAR"));
	action.moveToElement(type).build().perform();
	
	driver.findElement(By.linkText("Alena")).click();
	driver.findElement(By.xpath("//span[text()='size & fit']")).click();
	driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-verticalsizegroupformat facet-linkname-S']")).click();
		
	Select dropdown = new Select(driver.findElement(By.xpath("//div[@class='sort ']//div/select/option")));  
	dropdown.selectByVisibleText("Discount"); 
}
}