package com.Testing_project.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import org.junit.Assert;

import com.Testing_project.pages.MainMenuPage;
import com.Testing_project.pages.MyRequestsPage;

public class MyRequestsSteps extends ScenarioSteps {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	MainMenuPage homePage;
	MyRequestsPage myRequestsPage;

	//click - pe "Vacation"
	@Step
	public void clickVacationTab() {
		homePage.clickVacationTab();
	}
	
	//click - pe "My requests"
	@Step
	public void clickMyReqButton() {
		myRequestsPage.clickOnMyRequests();
	}
	
	//verificare element pe pagina
	@Step
	public void label_ShouldbeDisplayed(boolean expected) {
		Assert.assertEquals(expected, myRequestsPage.labelIsPresent());
		
	}
	
	//check -> checkbox "Holiday"
	@Step
	public void checkHoliday() {
		myRequestsPage.clickOnHoliday();
	}
	
	//click -> buton "Apply"
	@Step
	public void clickApply() {
		myRequestsPage.clickOnApplyButton();
	}
	
	
}
