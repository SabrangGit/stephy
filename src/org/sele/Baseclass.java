package org.sele;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Baseclass {
	static WebDriver driver;
	public static WebDriver launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Alex\\eclipse-workspace\\SeleniumDay2\\driv\\chromedriver.exe");
		driver= new ChromeDriver();
		return driver;
	}
	public static void loadurl(String url) {
		driver.get(url);
	}
	public static void gettitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	public static void getcurrenturl() {
		 String url = driver.getCurrentUrl();
System.out.println(url);
	}
	public static void type(WebElement e,String value) {
		e.sendKeys(value);
	}
	public static void click(WebElement e) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", e);
		

	}
	public static void button(WebElement e) {
		e.click();
	}
	public static void checkbox(WebElement e) {
		e.click();
	}
	public static void dragdrop(WebElement e,String s1) {
	Select s=new Select(e);
	s.selectByValue(s1);

	}
	

	

}
