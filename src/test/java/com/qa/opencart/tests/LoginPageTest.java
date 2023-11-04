package com.qa.opencart.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;
import com.qa.opencart.constants.AppConstants;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

@Epic("EPIC - 100: design login for opencart app")
@Story("US-Login: 101: design login page features for open cart")
public class LoginPageTest extends BaseTest {
	@Severity(SeverityLevel.TRIVIAL)
	@Description("checking the title of the page..... Tester: Tanisha")
	@Test(priority = 1)
	public void loginPageTitleTest() {
		String actualTitle = loginPage.getLoginPageTitle();
		Assert.assertEquals(actualTitle, AppConstants.LOGIN_PAGE_TITLE_VALUE);

	}

	@Severity(SeverityLevel.NORMAL)
	@Description("checking the url of the page..... Tester: Tanisha")
	@Test(priority = 2)
	public void loginPageURLTest() {
		String actualURL = loginPage.getLoginPageURL();
		Assert.assertTrue(actualURL.contains(AppConstants.LOGIN_PAGE__URL_FRACTION_VALUE));

	}
	@Severity(SeverityLevel.CRITICAL)
	@Description("checking the forgot pwd link exist..... Tester: Tanisha")
	@Test(priority = 3)

	
	public void forgotPWDLinkExistTest() {
		Assert.assertTrue(loginPage.isForgotPwdLinkExist());

	}
	@Severity(SeverityLevel.CRITICAL)
	@Description("checking the user is able to login to app with correct username and password.....")
	@Test(priority = 3)



	public void loginTest() {
		accPage = loginPage.doLogin(prop.getProperty("username").trim(), prop.getProperty("password").trim());
		Assert.assertTrue(accPage.isLogoutLinkExist());
	}

}
