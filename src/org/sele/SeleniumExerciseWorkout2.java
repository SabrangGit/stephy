package org.sele;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumExerciseWorkout2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Alex\\eclipse-workspace\\SeleniumDay2\\driv\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://www.adactin.com/HotelApp/");
		d.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		WebElement u = d.findElement(By.id("username"));
		u.sendKeys("sabrang");
		WebElement p = d.findElement(By.id("password"));
		p.sendKeys("sab");
		d.findElement(By.xpath("(//input[@class='login_button'])")).click();
		d.quit();
		
	}

}

