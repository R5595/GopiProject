package org.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Training {
	public static void main(String[] args) throws IOException, Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\new selenum\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 12",Keys.ENTER);
	
		driver.navigate().back();
		driver.navigate().to("http://demo.guru99.com/test/guru99home/");

		driver.switchTo().frame("a077aa5e");
		driver.findElement(By.xpath("//img[@src='Jmeter720.png']")).click();
		driver.navigate().back();
		String handle = driver.getWindowHandle();
		driver.switchTo().window(handle);
		Thread.sleep(1000);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		File file = new File("C:\\Users\\vimal\\Pictures\\Saved Pictures\\selenium\\ou.png");
		
		FileUtils.copyFile(screenshotAs, file);

		
	}
}
