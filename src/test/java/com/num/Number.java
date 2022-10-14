package com.num;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Number extends Base {

	@Test
	public void method() throws InterruptedException {

		launchBrowser("chrome", "https://numadic.com/careers/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		HomePage hp = new HomePage();
		WebElement joinOurCrewText = hp.getJoinOurCrewText();
		System.out.println(joinOurCrewText.getText());

		Select s = new Select(hp.getJobTypeDropdown());

		s.selectByIndex(3);

		String expected = "There are no available job positions that match your filters.";

		Assert.assertEquals(expected, hp.getWarningMessage().getText());

		s.selectByVisibleText("Full time");

		hp.getQaEngineer().click();
		Assert.assertTrue(driver.getCurrentUrl().contains("qa"));

		JobPage jp = new JobPage();

		jp.getApplyNow().click();
		
		
		  JavascriptExecutor js = (JavascriptExecutor)driver;
		  js.executeScript("arguments[0].click();", hp.getApply());
		  
		  
		  
		  
	  
	  
	  Thread.sleep(2000);
	jp.getKarpagavel().sendKeys("Karpagavel");
	jp.getP().sendKeys("P");
	jp.getpkarpagavel33().sendKeys("pkarpagavel133@gmail.com");
	jp.getK().sendKeys("8524943001");
	jp.getJuly14().sendKeys("07/14/1997");
	jp.getCricket().sendKeys("Cricket");
	jp.getCats().sendKeys("Cats");
	jp.getChennai().sendKeys("Srivilliputhur");
	jp.getCuddalore().sendKeys("Srivilliputhur");
	
	
	
	  
	  
	  
	 
	  
	  
	  
		  
  
  
	  
	  
	 
	 
	  
	}
}
