package org.testleaf.zoomcar.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ProjectSpecificMethods {
	public static ChromeDriver driver;
	public String excelFileName;

	
	@BeforeMethod
	public void startApp() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zoomcar.com/chennai");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@AfterMethod
	public void closeApp() {
	//	driver.close();
	}
//	@DataProvider(name="fetchData")
//	public Object[][] dataCentre() throws IOException {
//		return ReadExcel.readData(excelFileName);
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
