package Baseconcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Baseclass1 {
	public static WebDriver driver;
	public static WebDriver browserLaunch() {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}
	public static void urlpass(String url) {
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	}
	public static void email(WebElement element,String name) {
		element.sendKeys(name);
	}
	public static void password(WebElement element,String password) {
		element.sendKeys(password);

	}
	public static void login(WebElement element) {
		element.click();
	}
	public static void locations(WebElement element,String name) {
		Select sc=new Select(element);
		sc.selectByVisibleText(name);
	}
	public static void hotels(WebElement element,String name) {
		Select sc=new Select(element);
		sc.selectByVisibleText(name);
	}
	public static void roomType(WebElement element,String name) {
		Select sc=new Select(element);
		sc.selectByVisibleText(name);
	}
	public static void roomscount(WebElement element,String name) {
		Select sc=new Select(element);
		sc.selectByVisibleText(name);
	}
	public static void adultcount(WebElement element,String name) {
		Select sc=new Select(element);
		sc.selectByVisibleText(name);
	}
	public static void childs(WebElement element,String name) {
		Select sc=new Select(element);
		sc.selectByVisibleText(name);
	}
	public static void search(WebElement element) {
		element.click();
	}
	public static void clicktocontinue(WebElement element) {
		element.click();
	}
	public static void confirm(WebElement element) {
		element.click();
	}
	public static void sendname(WebElement element,String name) {
		element.sendKeys(name);
	}
	public static void lastname(WebElement element,String name) {
		element.sendKeys(name);
	}
	public static void address(WebElement element,String name) {
		element.sendKeys(name);
	}
	public static void cardnumber(WebElement element,String num) {
		element.sendKeys(num);
	}
	public static void cardtype(WebElement element,String num) {
		Select sc=new Select(element);
		sc.selectByVisibleText(num);
	}
	public static void cardmonth(WebElement element,String num) {
		Select sc=new Select(element);
		sc.selectByVisibleText(num);
	}
	public static void carddate(WebElement element,String num) {
		Select sc=new Select(element);
		sc.selectByVisibleText(num);
	}
	public static void cvvnum(WebElement element,String num) {
		element.sendKeys(num);
	}
	public static void booking(WebElement element) throws Throwable {
		element.click();
		Thread.sleep(3000);
	}
	public static void scrolldown(WebElement element) {
    JavascriptExecutor j= (JavascriptExecutor) driver;
    j.executeScript("arguments[0].scrollIntoView();",element);
	}
	public static void logout(WebElement element) {
		element.click();
	}
} 
