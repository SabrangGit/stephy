package org.sele;

public class ExecutableClass extends Baseclass {
	public static void main(String[] args) {
		launchBrowser();
		loadurl("\"https://www.toolsqa.com/automation-practice-form/\"");
		Locators l=new Locators();
		type(l.getFname(),"stephy");
		type(l.getLname(), "24566");
		click(l.getBname());
		
	}

}
