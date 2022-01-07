  package Baseconcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Demochild extends Democlass{
	public static void main(String[] args) throws Throwable {
		browserLaunch("chrome");
		brow("http://automationpractice.com/index.php");
		click(driver.findElement(By.xpath("//a[@rel='nofollow'][1]")));
//		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//		sendkey(driver.findElement(By.id("email_create")), "aqueel@gmail.com");
//		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//	    selectGender(driver.findElement(By.id("id_gender1")));
//	    driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//	    firstname(driver.findElement(By.id("customer_firstname")), "Aqueel");
//	    lastname(driver.findElement(By.id("customer_lastname")), "Basith");
//	    driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//	    password(driver.findElement(By.id("passwd")), "1234567");
//	    driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS); 
//	    dropDown(driver.findElement(By.id("days")), "19");
//	    dropMonth(driver.findElement(By.id("months")), "12");
//	    driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//	    dropYear(driver.findElement(By.id("years")), "2020");
//	    driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//	    chkbox(driver.findElement(By.id("newsletter")));
//	    cmpny(driver.findElement(By.id("company")), "testcase");
//	    driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//	    address(driver.findElement(By.id("address1")), "Address");
//	    city(driver.findElement(By.id("city")), "vnr");
//	    driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//	    states(driver.findElement(By.id("id_state")), "14");
//	    postCode(driver.findElement(By.id("postcode")), "62600");
//	    driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//	    phoneNumber(driver.findElement(By.id("phone_mobile")),"123465800");
//	    driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//	    register(driver.findElement(By.id("submitAccount")));
		signin(driver.findElement(By.id("email")), "aqueel@gmail.com");
		passwd(driver.findElement(By.id("passwd")), "1234567");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		clicksignin(driver.findElement(By.id("SubmitLogin")));
	    search(driver.findElement(By.id("search_query_top")), "T-shirts");
	    driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	    clickButton(driver.findElement(By.name("submit_search")));
	    order(driver.findElement(By.xpath("(//a[@class='product-name'])[1]")));
	    cart(driver.findElement(By.name("Submit")));
	    driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	    proceed(driver.findElement(By.xpath("//a[@class='btn btn-default button button-medium']")));
		proceedorder(driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]")));
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	    further(driver.findElement(By.xpath("//button[@class='button btn btn-default button-medium']")));
        clickccheckbox(driver.findElement(By.id("cgv")));
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        moveTo(driver.findElement(By.name("processCarrier")));
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	    payment(driver.findElement(By.xpath("//a[@class='cheque']")));
	    confirmOrder(driver.findElement(By.xpath("(//button[@type='submit'])[2]")));
	}
	
}