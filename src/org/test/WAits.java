package org.test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WAits {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\new selenum\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	WebElement txtuser = driver.findElement(By.id("email"));
	txtuser.sendKeys("hi");
	WebElement txtpass = driver.findElement(By.id("pass"));
	txtpass.sendKeys("hello");
	
	WebDriverWait w = new WebDriverWait(driver, 100);
	
	WebElement until = w.until(ExpectedConditions.elementToBeClickable(By.name("login")));
	until.click();
	
	Wait w1 =new FluentWait(driver).withTimeout(Duration.ofSeconds(100)).pollingEvery(Duration.ofSeconds(5)).ignoring(Throwable.class);
	
	Thread.sleep(1000);
	

}
}
