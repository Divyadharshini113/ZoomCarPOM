package org.testleaf.zoomcar.pages;

import org.openqa.selenium.By;
import org.testleaf.zoomcar.base.ProjectSpecificMethods;

public class StartPage extends ProjectSpecificMethods {

	public StartPage clickThuraipakkam() throws InterruptedException
	{
		//Thread.sleep(1000);
	driver.findElement(By.xpath("(//div[@class='heading']/following-sibling::div[1])[1]")).click();
	//driver.findElementByXPath("//a[@class='search']").click();
		return this;

	}

public PickUpPage clickNext()
{
	
	driver.findElementByXPath("//button[@class='proceed']").click();
	return new PickUpPage();
	
}
}
