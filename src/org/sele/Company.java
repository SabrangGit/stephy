package org.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Company extends Baseclass {
	public static void main(String[] args) {
		launchBrowser();
		loadurl("https://www.toolsqa.com/automation-practice-form/");
		gettitle();
		getcurrenturl();
		WebElement first = driver.findElement(By.name("firstname"));
		type(first, "stephy");
		WebElement last = driver.findElement(By.id("lastname"));
		type(last, "lucious");
		WebElement c = driver.findElement(By.xpath("//input[@value='Female']"));
		click(c);
		WebElement g = driver.findElement(By.id("exp-1"));
		click(g);
		WebElement h = driver.findElement(By.xpath("//input[@id='datepicker']"));
		type(h, "02/03/2019");
		WebElement j = driver.findElement(By.xpath("//input[@id='profession-1']"));
		checkbox(j);
		WebElement l = driver.findElement(By.xpath("//select[@id='continents']"));
		dragdrop(l, "EU");
		
	}

}
