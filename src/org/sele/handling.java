package org.sele;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handling {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Alex\\eclipse-workspace\\SeleniumDay2\\driv\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		d.get("https://www.homedepot.com");
		d.findElement(By.id("headerSearch")).sendKeys("celling fan");
		d.findElement(By.xpath("(//button[@title='Submit Search'])")).click();
		d.findElement(By.xpath("(//img[@class='stretchy '])[1]")).click();
		d.findElement(By.xpath("(//span[@class='bttn__content'])[4]")).click();
		String pw = d.getWindowHandle();
		System.out.println(pw);
		Set<String> all = d.getWindowHandles();
		System.out.println(all);
		for (String y : all) {
			if (!(y.equals(pw))) {
				d.switchTo().window(y);
		d.quit();
		
		
		
	}

}
	}
}
