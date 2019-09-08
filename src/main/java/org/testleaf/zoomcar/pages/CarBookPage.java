package org.testleaf.zoomcar.pages;

import org.testleaf.zoomcar.base.ProjectSpecificMethods;

public class CarBookPage extends ProjectSpecificMethods {

	public CarBookPage clickDesort() throws InterruptedException {
		Thread.sleep(3000);

		driver.findElementByXPath("//div[text()= ' Price: High to Low ']").click();
	//	Thread.sleep(3000);

		return this;
	}

	public CarBookPage getFirstCarName() {
		String text1 = driver.findElementByXPath("(//div[@class='details'])[1]").getText();

		System.out.println(text1);
		return this;

		/*public CarBookPage clickDesort() {
		driver.findElement(By.xpath("//div[text()=' Price: High to Low ']")).click();
		return this;

	}

	public CarBookPage getFirstCarName() {
		WebElement str= driver.findElement(By.xpath("(//div[@class='details']//h3)[1]"));
		System.out.println(str.getText());
		return this;
	}*/
	}
}
