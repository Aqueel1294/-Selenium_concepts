package Baseconcept;

import java.awt.AWTException;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Baseclass {
    public static WebDriver driver;
	public static WebDriver browserLaunch(String browsername) {
		try {
			if (browsername.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
				 driver =new ChromeDriver();
				
			}else if(browsername.equalsIgnoreCase("edge")){
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
				 driver =new ChromeDriver();
				
}else {
			System.out.println("Invalid");
}
		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.manage().window().maximize();
		return driver;
}
	public static void browser(String url) {
		try {
			driver.get(url);
		} catch (Exception e) {
			e.printStackTrace();
		}
     
	}
	public static void navigate(String url) {
		driver.navigate().to(url);
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
      
	}
	public static void get() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		String title = driver.getTitle();
		System.out.println(title);
			}
	public static void scrolloperation(WebElement scroll,WebElement up) throws Throwable{
    JavascriptExecutor js=(JavascriptExecutor) driver;
    js.executeScript("arguments[0].scrollIntoView();",scroll );
    Thread.sleep(2000);
    js.executeScript("arguments[0].scrollIntoView();",up );
	}
	public static void sendkeys(WebElement e,String text) {
		e.sendKeys(text);  
     	}
	public static void Robot() throws AWTException, Throwable {
    java.awt.Robot r=new java.awt.Robot();
    r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_ENTER);
	}
	public static void click(WebElement click) {
    click.click();
		}
	public static void windowhandle(WebElement text) throws AWTException, Throwable {
    Actions ac=new Actions(driver);
    ac.contextClick(text).perform();
    Thread.sleep(2000);
    java.awt.Robot r=new java.awt.Robot();
    r.keyPress(KeyEvent.VK_DOWN);
    r.keyPress(KeyEvent.VK_ENTER);
	}
}
   