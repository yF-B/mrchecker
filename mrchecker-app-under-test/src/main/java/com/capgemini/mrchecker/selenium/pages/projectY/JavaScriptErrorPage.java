package com.capgemini.mrchecker.selenium.pages.projectY;

import org.openqa.selenium.By;

import com.capgemini.mrchecker.selenium.core.newDrivers.elementType.Button;
import com.capgemini.mrchecker.selenium.pages.environment.GetEnvironmentParam;
import com.capgemini.mrchecker.selenium.pages.environment.PageSubURLsProjectYEnum;
import com.capgemini.mrchecker.test.core.logger.BFLogger;

public class JavaScriptErrorPage extends TheInternetSubpage {
	
	public final By pageLinkSelector = By.cssSelector("li > a[href*='javascript_error']");
	
	@Override
	public boolean isLoaded() {
		getDriver().waitForPageLoaded();
		return getDriver().getCurrentUrl()
						.contains(PageSubURLsProjectYEnum.JAVASCRIPT_ERROR.getValue());
	}
	
	@Override
	public void load() {
		BFLogger.logDebug("Load 'Javascript error' page.");
		getDriver().get(GetEnvironmentParam.THE_INTERNET_MAIN_PAGE.getValue() + PageSubURLsProjectYEnum.JAVASCRIPT_ERROR.getValue());
		getDriver().waitForPageLoaded();
	}
	
	@Override
	public String pageTitle() {
		return getActualPageTitle();
	}
	
	@Override
	public void clickPageLink() {
		new Button(pageLinkSelector).click();
	}
	
}