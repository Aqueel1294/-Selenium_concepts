package Launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathdemo {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HOME\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
 WebDriver driver=new ChromeDriver();
 driver.get("https://www.flipkart.com/");
WebElement demo = driver.findElement(By.xpath("//input[@type='text']"));
demo.sendKeys("Smartwatch");
Thread.sleep(2000);
 driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

}
