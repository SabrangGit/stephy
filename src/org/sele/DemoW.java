package org.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoW {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Alex\\eclipse-workspace\\SeleniumDay2\\driv\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.toolsqa.com");
		WebElement f = d.findElement(By.xpath("//span[text()='REGISTER NOW']"));
		//create object
				JavascriptExecutor js=(JavascriptExecutor)d;
				js.executeScript("arguments[0].click()",f);

	

}}
