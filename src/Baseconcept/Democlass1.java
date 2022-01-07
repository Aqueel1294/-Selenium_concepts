package Baseconcept;

import org.openqa.selenium.By;

public class Democlass1 extends Baseclass1{
	public static void main(String[] args) throws Throwable {
    browserLaunch();
    urlpass("https://adactinhotelapp.com/");
    email(driver.findElement(By.id("username")),"Aqueel1219");
    password(driver.findElement(By.id("password")),"aqueel19");
    login(driver.findElement(By.id("login")));
    locations(driver.findElement(By.id("location")),"Los Angeles");
    hotels(driver.findElement(By.id("hotels")),"Hotel Hervey");
    roomType(driver.findElement(By.id("room_type")),"Super Deluxe");
    roomscount(driver.findElement(By.id("room_nos")), "5 - Five");
    adultcount(driver.findElement(By.id("adult_room")),"2 - Two");
    childs(driver.findElement(By.id("child_room")),"0 - None");
    search(driver.findElement(By.id("Submit")));
    clicktocontinue(driver.findElement(By.id("radiobutton_0")));
    confirm(driver.findElement(By.id("continue")));
    sendname(driver.findElement(By.id("first_name")),"Aqueel");
    lastname(driver.findElement(By.id("last_name")), "basith");
    address(driver.findElement(By.id("address")),"124,Muthunagar,covai");
    cardnumber(driver.findElement(By.id("cc_num")),"1234567891234567");
    cardtype(driver.findElement(By.id("cc_type")),"VISA");
    cardmonth(driver.findElement(By.id("cc_exp_month")),"April");
    carddate(driver.findElement(By.id("cc_exp_year")),"2013");
    cvvnum(driver.findElement(By.id("cc_cvv")),"123");
    booking(driver.findElement(By.id("book_now")));
    scrolldown(driver.findElement(By.linkText("Adactin.com")));
    logout(driver.findElement(By.id("logout")));
    }


}
