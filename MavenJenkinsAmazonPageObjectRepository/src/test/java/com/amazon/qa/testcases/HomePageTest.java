package com.amazon.qa.testcases;

import org.testng.annotations.BeforeClass;

import com.amazon.qa.base.TestBase;
import com.amazon.qa.pages.LoginPage;
import com.amazon.qa.pages.HomePage;

public class HomePageTest extends TestBase {
	public LoginPage loginPage;
	HomePage homePage;

	public HomePageTest() {
		super();
	}

	@BeforeClass
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("userName"), prop.getProperty("passWord"));
	}

}
