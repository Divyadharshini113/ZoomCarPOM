package org.testleaf.zoomcar.pages;

import org.openqa.selenium.By;
import org.testleaf.zoomcar.base.ProjectSpecificMethods;

public class PickUpPage extends ProjectSpecificMethods {
	
	public PickUpPage clickTommorrow() {
		driver.findElement(By.xpath("(//div[@class='day low-price'])[1]")).click();
		return this;
	
	}

public DropOffPage clickNext() {
	driver.findElementByXPath("//button[@class='proceed']").click();
	return new DropOffPage();

}

}
