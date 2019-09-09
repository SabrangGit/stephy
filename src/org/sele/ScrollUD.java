package org.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUD {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Alex\\eclipse-workspace\\TestngSample\\driv\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.greenstechnologys.com");
		JavascriptExecutor js =(JavascriptExecutor)driver;
		WebElement down = driver.findElement(By.xpath("//span[text()='Greens Technologies Porur']"));
		js.executeScript("arguments[0].scrollIntoView(true)", down);
		Thread.sleep(5000);
		String t = down.getText();
		System.out.println(t);
		WebElement up = driver.findElement(By.xpath("//h1[text()='No 1 Software Training Institutes in Chennai with Placements']"));
		js.executeScript("arguments[0].scrollIntoView(false)", up);
	

}
}
