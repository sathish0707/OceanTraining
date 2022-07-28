package edu.Automationlearning;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class bankBazar {

	 @Test

		public void Customer() throws InterruptedException
		{
			
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.manage().window().maximize();
		driver.get("https://www.bankbazaar.com/");
		Thread.sleep(5000);
		WebElement loan = driver.findElement(By.xpath("//li[@class='loans-menu']"));
		Actions action = new Actions(driver);
		action.moveToElement(loan).perform();
		driver.findElement(By.linkText("Personal Loan")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()='Salaried']")).click();
		driver.findElement(By.xpath("//div[@class='ui dropdown custom transparent inactive desktop  big']")).sendKeys("INFOSYS LTD");
		//driver.findElement(By.xpath("//div[@class='ui fluid search selection dropdown  search']/input")).sendKeys("INFOSYS LTD");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[@type='button']")).click();
		Thread.sleep(2000);
		}
}
