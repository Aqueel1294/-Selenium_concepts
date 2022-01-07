package Launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.ui.Select;

public class Dropconcept {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\HOME\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement drop = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
	drop.click();
	Thread.sleep(2000);
	WebElement day = driver.findElement(By.id("day"));
    Thread.sleep(2000);
    Select s=new Select(day);
    s.selectByVisibleText("5");
    WebElement month = driver.findElement(By.id("month"));
    Thread.sleep(2000);
    Select s1=new Select(month);
    s1.selectByVisibleText("Mar");
	}

}
