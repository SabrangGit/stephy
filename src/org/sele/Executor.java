package org.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Executor {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Alex\\eclipse-workspace\\SeleniumDay2\\driv\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com");
		WebElement username = d.findElement(By.id("email"));
		WebElement password = d.findElement(By.id("pass"));
		WebElement button = d.findElement(By.id("loginbutton"));
		//creating object
		JavascriptExecutor js=(JavascriptExecutor)d;
		//to insert
		js.executeScript("arguments[0].setAttribute('value','stephy')",username);
		js.executeScript("arguments[0].setAttribute('value','25411')", password);
		//get attribute
		Object o = js.executeScript("return arguments[0].getAttribute('value')",username);
		//typecaste
		String s=(String)o;
		System.out.println(s);
		Object b = js.executeScript("return arguments[0].get"
				+ "Attribute('value')",password);
		//typecaste
		String g=(String)b;
		System.out.println(g);
		//click
		js.executeScript("arguments[0].click()", button);
		
		

		
	}

}
