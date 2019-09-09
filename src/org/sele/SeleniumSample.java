package org.sele;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumSample {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Alex\\eclipse-workspace\\SeleniumDay2\\driv\\chromedriver.exe");
WebDriver d=new ChromeDriver();
d.get("https://www.swiggy.com");
d.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
WebElement f = d.findElement(By.id("location"));
f.sendKeys("ammapettai");
d.findElement(By.xpath("(//span[text()='FIND FOOD'])")).click();
Thread.sleep(5000);
d.quit();
		
		
		
		
		
		
		
	}
}
