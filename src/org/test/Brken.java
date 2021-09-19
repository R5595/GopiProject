package org.test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brken {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\new selenum\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		List<WebElement> link = driver.findElements(By.tagName("a"));
		int size = link.size();
		System.out.println(size);
		int count = 0;
		for (int i = 0; i <link.size(); i++) {
			WebElement element = link.get(i);
			String attribute = element.getAttribute("href");
			System.out.println(attribute);
			if(attribute==null) {
				URL u = new URL(attribute);
				URLConnection openConnection = u.openConnection();
				HttpURLConnection h= (HttpURLConnection)openConnection;
				int responseCode = h.getResponseCode();
				if (responseCode!=200) {
					System.out.println("Broken Links"+attribute);
					count++;
				}
			}
			
		}
		System.out.println("Broken counts"+count);

		
		}
	

}
