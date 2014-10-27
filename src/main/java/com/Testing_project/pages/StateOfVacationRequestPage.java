package com.Testing_project.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;

public class StateOfVacationRequestPage extends PageObject {
	
	
	//element identification - "State" Vacation Request text
	@FindBy(css = "div[class='view-vacation']")
	public WebElementFacade textStateVacationRequest;
	
	//element identification - Vacation Info text
	@FindBy(css = "div[class='content-title']")
	public WebElementFacade textVacationInfo;
	
	// element identification - Withdraw button
	@FindBy(css = "input[id='_evovacation_WAR_EvoVacationportlet_withdrawnVacationRequest']")
	public WebElementFacade withdrawButton;
	
	
	//function - verify is an element is present in a page
	public boolean stateVacationRequestPresence() {
		return textStateVacationRequest.isPresent();
	}
	
	//function - verify is an element is present in a page
	public boolean vacationInfoPresence() {
		return textVacationInfo.isDisplayed();
	}
	
	// click -> buton "Withdraw"
	@Step
	public void clickWithdraw() {
		withdrawButton.click();
	}
}

