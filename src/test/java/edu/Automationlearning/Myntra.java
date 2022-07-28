package edu.Automationlearning;


import java.util.List;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Myntra {

	@Test
	
	public void CourseCount() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		Thread.sleep(5000);
		//driver.findElement(By.linkText("Myntra Fashion Search")).sendKeys("Sathish");
						
		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("Sunglasses");
		driver.findElement(By.xpath("//a[@class='desktop-submit']")).click();
		driver.findElement(By.className("desktop-searchBar")).sendKeys("Polaroid",Keys.ENTER);
//		Actions action = new Actions(driver);
//		action.moveToElement(obj).perform();
//		WebElement online = driver.findElement(By.xpath("//a[text()='Polaroid']"));
//		action.moveToElement(online).click().build().perform();
//		List<WebElement> buttonNameList = driver.findElements(By.xpath("//div[@class='Item-count']"));
//		System.out.println("Total Polaroid Brand Sunglasses ::"+ buttonNameList.size());
//		System.out.println("");
//		for (WebElement buttonName : buttonNameList) {
//			String details = buttonName.getText();
//			System.out.println(details);
//		
}
}