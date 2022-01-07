 package Launch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framesconcept {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HOME\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.leafground.com/pages/frame.html");
		//		WebElement in = driver.findElement(By.xpath("//section[@class='innerblock']"));
		//		driver.switchTo().frame(in);
		//	    WebElement inner = driver.findElement(By.id("wrapframe"));
		//	    driver.switchTo().frame(inner);
		WebElement inn = driver.findElement(By.xpath("//iframe[@src='default.html']"));
		driver.switchTo().frame(inn);
		WebElement click = driver.findElement(By.id("Click"));
		click.click();
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		WebElement clickin = driver.findElement(By.xpath("//iframe[@src='page.html']"));
		driver.switchTo().frame(clickin);
		WebElement inner = driver.findElement(By.id("frame2"));
		driver.switchTo().frame(inner);
		WebElement click1 = driver.findElement(By.id("Click1"));
		click1.click();
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		List<WebElement> click1in = driver.findElements(By.id("wrapframe"));
//	    driver.switchTo().frame(0).switchTo().frame(0);
//		WebElement count = driver.findElement(By.xpath("//iframe[@src='count.html']"));
//		driver.switchTo().frame(0).switchTo().frame(0);
		System.out.println(click1in.size());




	}

}
