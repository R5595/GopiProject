package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navi {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\new selenum\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();

	driver.get("https://www.facebook.com/");
//	WebElement txtuser = driver.findElement(By.id("email"));
//	boolean b = txtuser.isDisplayed();
//	boolean c = txtuser.isEnabled();
//	if (b==true && c==true) {
//		txtuser.sendKeys("hi");
//	}
//	
	WebElement cacc = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
	cacc.click();
	Thread.sleep(3000);

	WebElement male = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
	boolean d = male.isSelected();
	System.out.println(d);
	male.click();
	boolean e = male.isSelected();
	System.out.println(e);
	}
}
