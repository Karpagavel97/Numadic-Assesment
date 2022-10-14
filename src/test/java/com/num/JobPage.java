package com.num;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JobPage extends Base  {
	
	
	public JobPage() {
		PageFactory.initElements(driver,this);

	}

	@FindBy(xpath="//a[text()='Apply here now']")
	private WebElement applyNow;
	
	@FindBy(id="firstName")
	private WebElement Karpagavel;
	
	@FindBy(id="lastName")
	private WebElement P;
	
	@FindBy(id="email")
	private WebElement pkarpagavel33;
	
	@FindBy(id="phone")
	private WebElement k ;
	
	@FindBy(xpath="//a[text()='View available positions']")
	private WebElement careerbutton;
	public WebElement getCareerbutton() {
		return careerbutton;
	}

	@FindBy(id="sports")
	private WebElement Cricket ;
	
	@FindBy(id="pets")
	private WebElement Cats ;
	
	@FindBy(name="Current location")
	private WebElement Chennai ;
	
	public WebElement getApplyNow() {
		return applyNow;
	}

	public void setApplyNow(WebElement applyNow) {
		applyNow = applyNow;
	}

	public WebElement getKarpagavel() {
		return Karpagavel;
	}

	public void setKarpagavel(WebElement karpagavel) {
		Karpagavel= karpagavel;
	}

	public WebElement getP() {
		return P;
	}

	public void setP(WebElement p) {
		P = p;
	}

	public WebElement getpkarpagavel33() {
		return pkarpagavel33;
	}

	public void setpkarpagavel33(WebElement pkarpagavel33) {
		this.pkarpagavel33 =pkarpagavel33;
	}

	public WebElement getK() {
		return k;
	}

	public void setK(WebElement k) {
		this.k = k;
	}

	public WebElement getCricket() {
		return Cricket;
	}

	public void setCricket(WebElement cricket) {
		Cricket = cricket;
	}

	public WebElement getCats() {
		return Cats;
	}

	public void setCats(WebElement cats) {
		Cats = cats;
	}

	public WebElement getChennai() {
		return Chennai;
	}

	public void setChennai(WebElement chennai) {
		Chennai = chennai;
	}

	public WebElement getCuddalore() {
		return Cuddalore;
	}

	public void setCuddalore(WebElement cuddalore) {
		Cuddalore = cuddalore;
	}

	public WebElement getJuly14() {
		return Jan30;
	}

	public void setJan30(WebElement jan30) {
		Jan30 = Jan30;
	}

	@FindBy(name="Hometown")
	private WebElement Cuddalore ;
	
	@FindBy(id="dob")
	private WebElement Jan30; 

}
