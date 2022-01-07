package Baseconcept;

import org.openqa.selenium.By;

public class Demobasechild  extends Baseclass{
	public static void main(String[] args) throws Throwable {
		browserLaunch("chrome");
		browser("https://www.google.com/");
		navigate("https://www.amazon.in/");
		get();
		scrolloperation(driver.findElement(By.linkText("Italy")), driver.findElement(By.xpath("//span[text()='Home storage']")));
		sendkeys(driver.findElement(By.name("field-keywords")), "Iphone 13");
		Robot();
		click(driver.findElement(By.id("nav-search-submit-button")));
		windowhandle(driver.findElement(By.linkText("Fashion")));
	}
}



