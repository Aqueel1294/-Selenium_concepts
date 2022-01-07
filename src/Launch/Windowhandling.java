package Launch;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windowhandling {
public static void main(String[] args) throws AWTException {
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\HOME\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	Actions ac=new Actions(driver);
    WebElement click = driver.findElement(By.linkText("Customer Service"));
    ac.contextClick(click).perform();
    
    Robot r =new Robot();
    r.keyPress(KeyEvent.VK_DOWN);
    r.keyPress(KeyEvent.VK_ENTER);
    
     WebElement click1 = driver.findElement(By.linkText("Fashion"));
    ac.contextClick(click1).perform();
    r.keyPress(KeyEvent.VK_DOWN);
    r.keyPress(KeyEvent.VK_ENTER);
    
   String one = driver.getWindowHandle();
   System.out.println(one);
   String title = driver.switchTo().window(one).getTitle();
   System.out.println(title);
   
   Set<String> two = driver.getWindowHandles();
   for (String three : two) 
   {
	    String title2 = driver.switchTo().window(three).getTitle();
	    System.out.println(title2);
	    
	}
   
   String four = driver.getWindowHandle();
   for (String string2 : two) {
	   if (driver.switchTo().window(four).getTitle().equals("https://www.amazon.in/gp/help/customer/display")) {
		break;
	}
}
    
     
    
}
}
