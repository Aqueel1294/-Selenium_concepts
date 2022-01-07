package Launch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\HOME\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	driver.navigate().to("https://www.google.com/");
	
	Thread .sleep(2000);
	
	driver.navigate().back();
	 Thread.sleep(2000);
	 
	 driver.navigate().forward();
	 
	 String get = driver.getCurrentUrl();
	 System.out.println(get);
	 String title = driver.getTitle();
	 System.out.println(title);
   	
	 
	 
}
}
