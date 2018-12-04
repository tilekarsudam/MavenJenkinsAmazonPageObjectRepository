package com.amazon.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.KeyDownAction;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.amazon.qa.base.TestBase;

public class HomePage extends TestBase {

	@FindBy(how = How.XPATH, using = "//span[@class=\"nav-line-1\" and text()=\"Hello, Sudam\"]")
	WebElement CheckLoginUser;
	@FindBy(how = How.XPATH, using = "//span[@id=\"glow-ingress-line1\" and text()=\"Deliver to Sudam\"]")
	WebElement CheckDeliverToLoginUser;
	@FindBy(how = How.XPATH, using = "//a[@id=\"nav-link-shopall\"]")
	WebElement ShopByCategory;
	@FindBy(how = How.XPATH, using = "//div[@class=\"nav-template nav-flyout-content nav-tpl-itemList\"]//span[@data-nav-panelkey=\"WomensFashionPanel\"]")
	WebElement CategoryWomensFashion;
	@FindBy(how = How.XPATH, using = "//a[contains(@href,'nav_shopall_sbc_wfashion_clothing')]")
	WebElement CategoryWomensFashionClothings;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public void CheckLoginUser() {
		String ExpectedLoginUser = "Hello, Sudam";
		String ExpectedDeliverTo = "Deliver to Sudam";
		Assert.assertEquals(CheckLoginUser, ExpectedLoginUser);
		Assert.assertEquals(CheckDeliverToLoginUser, ExpectedDeliverTo);
	}
	
	public void shopByCategory(String ShopByCategoryList, String CategoryName, String CategoryWomensFashionClothingsName) {
		Actions act = new Actions(driver);
		act.moveToElement(ShopByCategory).build().perform();
		act.moveToElement(CategoryWomensFashion).build().perform();
		CategoryWomensFashionClothings.click();
		
		
		
	}

}
