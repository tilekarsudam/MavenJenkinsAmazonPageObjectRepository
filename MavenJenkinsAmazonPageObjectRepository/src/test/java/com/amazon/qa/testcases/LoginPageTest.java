package com.amazon.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.amazon.qa.base.TestBase;
import com.amazon.qa.pages.HomePage;
import com.amazon.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;

	public LoginPageTest() {
		super();
	}

	@BeforeClass
	public void setUp() {
		initialization();
		loginPage = new LoginPage();

	}

	@Test (priority=1)
	public void loginPageTitleTest() {
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title,
				"Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
	}

	@Test (priority=2)
	public void loginPageLogoTest() {
		boolean logo = loginPage.validateAmazonLogo();
		Assert.assertTrue(logo);
	}

	@Test (priority=3)
	public void loginTest() {
		homePage = loginPage.login(prop.getProperty("userName"), prop.getProperty("passWord"));

	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
