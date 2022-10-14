package com.num;




import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class HomePage extends Base {
	WebDriver driver;
	
	
	@FindBy(xpath="//div//h1[text()='JOIN OUR CREW']")
	private   WebElement joinOurCrewText;
	
	@FindBy(id="job_type")
	private WebElement jobTypeDropdown;
	
	@FindBy(xpath="//a[text()='QA Engineer']")
	private WebElement qaEngineer;
	
	 @FindBy(xpath="//td")
	private  WebElement warningMessage;
	
	
	public  WebElement getWarningMessage() {
		return warningMessage;
	}


	public   WebElement  getJoinOurCrewText() {
		return joinOurCrewText;
	}


	public WebElement getJobTypeDropdown() {
		return jobTypeDropdown;
	}


	public WebElement getQaEngineer() {
		return qaEngineer;
	}


	public WebElement getApply() {
		return apply;
	}


	@FindBy(xpath="(//button[text()='Apply'])[12]")
	private WebElement apply;
	@FindBy(xpath="//div[@id='step1']/div[@class='row']/div[@class='col-md-4']")
	private List<WebElement> personalDetailFields;
	
	public List<WebElement> getPersonalDetailFields() {
		return personalDetailFields;
	}


	public  HomePage() {
		driver = Base.getDriver();

	PageFactory.initElements(driver, this);
	
	}
	
}

