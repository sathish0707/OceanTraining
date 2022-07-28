package edu.Automationlearning;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebDriver;

import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	@Test

	public void ValidUser() throws InterruptedException
	{
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	driver.manage().window().maximize();
	driver.get("https://o3.openmrs.org/openmrs/spa/login");
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	driver.findElement(By.id("password")).sendKeys("Admin123");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	//driver.findElement(By.xpath("//input[@id='Inpatient Ward']/..")).click();
	driver.findElement(By.xpath("//span[@class='bx--radio-button__appearance']")).click();
  	
	driver.findElement(By.xpath("//button[@type='submit']/..")).click();
	driver.findElement(By.xpath("//button[@name='AddPatientIcon']")).click();
	driver.findElement(By.id("givenName")).sendKeys("Sathish");
	driver.findElement(By.id("middleName")).sendKeys(".");
	driver.findElement(By.id("familyName")).sendKeys("U");
	driver.findElement(By.id("birthdate")).sendKeys("07/07/1985",Keys.ENTER);
	
	driver.findElement(By.id("birthdateEstimated")).sendKeys("37");
	driver.findElement(By.id("male")).click();
	driver.findElement(By.xpath("//spanopenMRS ID")).sendKeys("mole");
	driver.findElement(By.id("postalCode")).sendKeys("607001");
	driver.findElement(By.id("address2")).sendKeys("28, 2nd Manjakuppam, Cuddalore");
	driver.findElement(By.id("address1")).sendKeys("28, 2nd Manjakuppam, Cuddalore");
	driver.findElement(By.id("country")).sendKeys("India");
	driver.findElement(By.id("stateProvince")).sendKeys("TamilNadu");
	driver.findElement(By.id("cityVillage")).sendKeys("Cuddalore");
	driver.findElement(By.id("phone")).sendKeys("9003765420");
	driver.findElement(By.id("email")).sendKeys("sathish.u@gmail.com");
	driver.findElement(By.id("autosuggest")).sendKeys("Shasa");
	driver.findElement(By.id("select")).click();
	driver.findElement(By.id("Create Patient")).click();
	}
}
