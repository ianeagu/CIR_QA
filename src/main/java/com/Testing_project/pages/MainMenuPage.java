package com.Testing_project.pages;

import org.openqa.selenium.WebElement;

import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;

public class MainMenuPage extends PageObject {
	@FindBy(css = "a[href*='vacation']")
	private WebElement vacationTab;

	public void clickVacationTab() {
		vacationTab.click();
	}
	
	
}
