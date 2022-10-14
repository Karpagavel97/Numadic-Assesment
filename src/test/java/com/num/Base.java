package com.num;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
public static WebDriver driver;
	
	public static WebDriver getDriver() {
	return driver;
}

public static void setDriver(WebDriver driver) {
	Base.driver = driver;
}

	public static  void launchBrowser(String name, String url) {
		
		if(name.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();
			
			Base.setDriver(driver);
		}else if(name.equals("firefox")) {
			
		}

	}

}
