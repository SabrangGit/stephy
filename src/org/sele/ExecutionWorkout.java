package org.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExecutionWorkout {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Alex\\eclipse-workspace\\SeleniumDay2\\driv\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://www.adactin.com/HotelApp/");
		WebElement user = d.findElement(By.id("username"));
		WebElement pass = d.findElement(By.id("password"));
		WebElement log = d.findElement(By.id("login"));
		//create object
		JavascriptExecutor js=(JavascriptExecutor)d;
		//insert
		js.executeScript("arguments[0].setAttribute('value','sabrang')",user );
		js.executeScript("arguments[0].setAttribute('value','alexis')",pass );
		//get attribute
		Object one = js.executeScript("return arguments[0].getAttribute('value')", user);
		//type caste
		String s=(String)one;
		System.out.println(s);
		Object two = js.executeScript("return arguments[0].getAttribute('value')", pass);
		//type caste
		String i=(String)two;
		System.out.println(i);
		//click
		js.executeScript("arguments[0].click()",log);
		
	

}
}
