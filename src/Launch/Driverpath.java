package Launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driverpath {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\HOME\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/login/");
	
	driver.manage().window().maximize();
	WebElement email = driver.findElement(By.id("email"));
	email.sendKeys("aqueelbasith19@gmail.com");
	
	WebElement mail = driver.findElement(By.name("pass"));
	mail.sendKeys("123456");
	 
	
}
}
