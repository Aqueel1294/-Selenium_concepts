   package Launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionconcept {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HOME\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.greenstech.in/selenium-course-content.html");
//	WebElement cource = driver.findElement(By.xpath("//div[@data-toggle='dropdown']"));
    Actions ac=new Actions(driver);
//	ac.moveToElement(cource).perform();
//	WebElement java = driver.findElement(By.xpath("//div[@title='Java']"));
//	ac.moveToElement(java).perform();
//	WebElement c = driver.findElement(By.linkText("Struts Certification Training"));
//	ac.click(c).perform();
	WebElement rytclick = driver.findElement(By.linkText("Corporate Training"));
	ac.contextClick(rytclick).perform();
	
	

	}

}
