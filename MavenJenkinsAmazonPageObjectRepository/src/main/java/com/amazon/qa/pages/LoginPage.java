package com.amazon.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.base.TestBase;

public class LoginPage extends TestBase {
	// Page Factoruy = Object Repository needs to define
	@FindBy(how = How.XPATH, using = "//span[@class=\"nav-line-1\" and text()=\"Hello. Sign in\"]")
	WebElement ClickOnSignIn;
	@FindBy(how = How.ID, using = "ap_email")
	WebElement userName;
	@FindBy(how = How.ID, using = "continue")
	WebElement ContinueButton;
	@FindBy(how = How.ID, using = "ap_password")
	WebElement passWord;
	@FindBy(how = How.ID, using = "signInSubmit")
	WebElement SignInSubmitButton;
	@FindBy(how = How.ID, using = "nav-logo")
	WebElement AmazonLogo;

//	Initializing the Page Objects
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

//	Actions
	public String validateLoginPageTitle() {

		System.out.println("Login Page Title is :" + driver.getTitle());
		return driver.getTitle();
	}

	public boolean validateAmazonLogo() {
		return AmazonLogo.isEnabled();
	}

	public HomePage login(String UserName, String PassWord) {
		ClickOnSignIn.click();
		userName.sendKeys(UserName);
		ContinueButton.click();
		passWord.sendKeys(PassWord);
		SignInSubmitButton.click();

		return new HomePage();
	}
}
