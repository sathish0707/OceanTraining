package edu.Automationlearning;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;


public class MyFirstPro {

	@Test
	

public void LoginUser() {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.manage().window().maximize();
	driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	driver.findElement(By.className("login")).click();
	driver.findElement(By.id("email_create")).sendKeys("mohan12577@gmail.com");
	driver.findElement(By.id("SubmitCreate")).click();
	driver.findElement(By.id("id_gender1")).click();
	driver.findElement(By.id("customer_firstname")).sendKeys("Mohan");
	driver.findElement(By.id("customer_lastname")).sendKeys("Kumar");
	//driver.findElement(By.id("email")).sendKeys("mohan1254@gmail.com");
	driver.findElement(By.id("passwd")).sendKeys("Login&124");
	
	WebElement days = driver.findElement(By.id("days"));
	Select selectDays = new Select(days);
	selectDays.selectByValue("7");
	WebElement months = driver.findElement(By.id("months"));
	Select selectMonths = new Select(months);
	selectMonths.selectByVisibleText("July ");
	WebElement years = driver.findElement(By.id("years"));
	Select selectYears = new Select(years);
	selectYears.selectByValue("1985");
	
	driver.findElement(By.id("firstname")).sendKeys("Mohan");
	driver.findElement(By.id("lastname")).sendKeys("Kumar");
	driver.findElement(By.id("company")).sendKeys("Global");
	driver.findElement(By.id("address1")).sendKeys("Kurmbapet");
	driver.findElement(By.id("address2")).sendKeys("pondy");
	driver.findElement(By.id("city")).sendKeys("Pondicherrry");
	driver.findElement(By.id("id_state")).sendKeys("New York");
	driver.findElement(By.id("postcode")).sendKeys("00000");
	driver.findElement(By.id("id_country")).sendKeys("United States");
	driver.findElement(By.id("other")).sendKeys("Register Login");
	driver.findElement(By.id("phone")).sendKeys("9999999999");
	driver.findElement(By.id("phone_mobile")).sendKeys("9999999999");
	driver.findElement(By.id("alias")).sendKeys("Register My Address");
	driver.findElement(By.id("submitAccount")).click();
	
}
	
//	public void createAutomation() {
	//	WebDriverManager.chromedriver().setup();
	//	WebDriver driver = new ChromeDriver();
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	//driver.manage().window().maximize();
	//driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	//driver.findElement(By.id("email")).sendKeys("sathish.u@straive.com");
	//driver.findElement(By.id("passwd")).sendKeys("Login@124");
	//driver.findElement(By.id("SubmitLogin")).click();
	//}
}
