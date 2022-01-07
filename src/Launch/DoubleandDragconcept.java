package Launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleandDragconcept {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HOME\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.google.com/");
		driver.get("http://www.leafground.com/pages/drop.html");
//		WebElement key = driver.findElement(By.name("q"));
		Actions ac=new Actions(driver);
//		key.sendKeys("amazon");
//		ac.doubleClick(key).perform();
		
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		ac.dragAndDrop(drag, drop).perform();
}
}
