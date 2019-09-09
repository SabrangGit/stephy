package org.sele;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hand {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Alex\\eclipse-workspace\\SeleniumDay2\\driv\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.amazon.com");
		d.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		d.findElement(By.xpath("(//input[@id='twotabsearchtextbox'])")).sendKeys("iphone x");
		d.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
		d.findElement(By.xpath("(//img[@class='s-image'])[1]")).click();
		d.findElement(By.xpath("(//input[@id='add-to-cart-button'])")).click();
		String pwh = d.getWindowHandle();
		System.out.println(pwh);
		Set<String> allwindow = d.getWindowHandles();
		System.out.println(allwindow);
		for (String x : allwindow) {
			if (!(x.equals(pwh))) {
				d.switchTo().window(x);
			}
		}
	}
}
				
				
		
		
