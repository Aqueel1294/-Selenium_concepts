package Baseconcept;

import java.nio.channels.Selector;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Democlass {
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
	public static void brow(String url) {
		driver.get(url);
     
	}
	public static void click(WebElement c) {
   c.click();
	}
//	public static void sendkey(WebElement c1,String url) {
//		c1.sendKeys(url);
//        driver.findElement(By.name("SubmitCreate")).click(); 
//	}
//	public static void selectGender(WebElement element) {
//		element.click();
//
//	}
//	public static void firstname(WebElement element,String text) {
//    element.sendKeys(text);
//	}
//	public static void lastname(WebElement element,String text) {
//	    element.sendKeys(text);
//		
//}
//	public static void password(WebElement element,String text) {
//    element.sendKeys(text);
//	}
//	public static void dropDown(WebElement element,String day) throws Throwable {
//     element.click();
//     Select s=new Select(element);
//     s.selectByValue(day);
//	}
//	public static void dropMonth(WebElement element,String month) throws Throwable {
//	     element.click();
//	     Select s=new Select(element);
//	     s.selectByValue(month);
//		
//}
//	public static void dropYear(WebElement element,String year) throws Throwable {
//	     element.click();
//	     Select s=new Select(element);
//	     s.selectByValue(year);
//	}
//	public static void chkbox(WebElement element) {
//		element.click();
//
//	}
//	public static void cmpny(WebElement element,String address) {
//    element.sendKeys(address);
//	}
//	public static void address(WebElement element,String address) {
//		element.sendKeys(address);
//	}
//	public static void city(WebElement element,String city) {
//		element.sendKeys(city);
//
//	}
//	public static void states(WebElement element,String state) {
//     element.click();
//     Select s=new Select(element);
//     s.selectByValue(state);
//	}
//	public static void postCode(WebElement element,String post) {
//    element.sendKeys(post);
//	}
//	public static void phoneNumber(WebElement element,String phnum) {
//    element.sendKeys(phnum);
//	}
//	public static void register(WebElement element) {
//    element.click();
//	}
	public static void signin(WebElement element,String email) {
    element.sendKeys(email);
	}
	public static void passwd(WebElement element,String passwd) {
    element.sendKeys(passwd);
	}
	public static void clicksignin(WebElement element) {
    element.click();
	}
	public static void search(WebElement element,String text) {
		element.sendKeys(text);

	}
	public static void clickButton(WebElement element) {
     element.click();
	}
	public static void order(WebElement element) {
    element.click();
	}
	public static void cart(WebElement element) {
    element.click();
	}
	public static void proceed(WebElement element) {
     JavascriptExecutor js=(JavascriptExecutor) driver;
     js.executeScript("arguments[0].click();", element);
	}
	public static void proceedorder(WebElement element) {
    element.click();
	}
	public static void further(WebElement element) {
		element.click();

	}
	public static void clickccheckbox(WebElement element) {
    element.click();
	}
	public static void moveTo(WebElement element) {
    element.click();
	}
	public static void payment(WebElement element) {
		element.click();

	}
	public static void confirmOrder(WebElement element) {
		element.click();
		

	}
}