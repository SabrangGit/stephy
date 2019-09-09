package org.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Alex\\eclipse-workspace\\SeleniumDay2\\driv\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.toolsqa.com/automation-practice-form/");
		WebElement f = d.findElement(By.xpath("//option[text()='South America'][1]"));
		Select s=new Select(f);
		s.selectByValue("South America");
		d.quit();

}
}