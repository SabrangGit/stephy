package org.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleExercises {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Alex\\eclipse-workspace\\SeleniumDay2\\driv\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.irctc.co.in/nget/train-search");
		WebElement f = d.findElement(By.xpath("(//input[@type='text'])[1]"));
		f.sendKeys("chengalpattu");
		WebElement g = d.findElement(By.xpath("(//input[@type='text'])[2]"));
		g.sendKeys("kollam");
		WebElement h = d.findElement(By.xpath("(//input[@type='text'])[3]"));
		h.click();
		Thread.sleep(5000);
		d.quit();
		
	}

}
