package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testlogin {
	
	public void createAutomation() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://o3.openmrs.org/openmrs/spa/login");
		driver.findElement(By.id("username")).sendKeys("OceanAca");
		driver.findElement(By.linkText("Contact the site administrator")).click();
	}

}
