package com.Testing_project.pages;

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
	
	
	//function - verify is an element is present in a page
	public boolean stateVacationRequestPresence() {
		return textStateVacationRequest.isPresent();
	}
	
	//function - verify is an element is present in a page
	public boolean vacationInfoPresence() {
		return textVacationInfo.isDisplayed();
	}
	
}

