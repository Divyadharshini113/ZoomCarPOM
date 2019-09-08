package org.testleaf.zoomcar.pages;

import org.testleaf.zoomcar.base.ProjectSpecificMethods;

public class Homepage extends ProjectSpecificMethods{
	
	public StartPage clickStart() {
		//Thread.sleep(2000);
		driver.findElementByXPath("//a[@class='search']").click();
		return new StartPage();

	}

}
