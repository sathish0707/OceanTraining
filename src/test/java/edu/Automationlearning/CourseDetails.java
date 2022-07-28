package edu.Automationlearning;

import java.util.List;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CourseDetails {
	
	WebDriver driver;
	
	@BeforeMethod
	public void beforeMethod()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.manage().window().maximize();
		driver.get("https://oceanacademy.co.in/");
	}
	
	
	@Test
	public void CourseCount() throws InterruptedException
	{
		
		Thread.sleep(5000);
	    driver.findElement(By.xpath("//div[@class='c-icon']")).click();
		WebElement coursee = driver.findElement(By.id("courses"));
		Actions action = new Actions(driver);
		action.moveToElement(coursee).perform();
		WebElement offline = driver.findElement(By.xpath("//a[text()='Offline Courses']"));
		action.moveToElement(offline).click().build().perform();
		List<WebElement> buttonNameList = driver.findElements(By.xpath("//p[@class='title']"));
		System.out.println("Available Offline Courses ::"+ buttonNameList.size());
		for (WebElement buttonName : buttonNameList) {
			String details = buttonName.getText();
			System.out.println(details);
     		}
		
	}
	@Test
		public void onlineCourse()throws InterruptedException		{
			
		Thread.sleep(5000);
	    driver.findElement(By.xpath("//div[@class='c-icon']")).click();
		WebElement coursee1 = driver.findElement(By.id("courses"));
		Actions action = new Actions(driver);
		action.moveToElement(coursee1).perform();
		WebElement online = driver.findElement(By.xpath("//a[text()='Online Courses']"));
		action.moveToElement(online).click().build().perform();
		List<WebElement> buttonNameList = driver.findElements(By.xpath("//div[@class='onlineCourses-content']"));
		System.out.println("Available Online Courses ::"+ buttonNameList.size());
		System.out.println("");
		for (WebElement buttonName : buttonNameList) {
			String details = buttonName.getText();
			System.out.println(details);
			System.out.println("");
			System.out.println("");
	   }
		}
@AfterMethod
public void afterMethod()
{
driver.quit();	
}
}

