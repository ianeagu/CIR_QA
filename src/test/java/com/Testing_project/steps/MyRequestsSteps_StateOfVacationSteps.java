package com.Testing_project.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import org.junit.Assert;

import com.Testing_project.pages.MainMenuPage;
import com.Testing_project.pages.MyRequestsPage;
import com.Testing_project.pages.StateOfVacationRequestPage;

public class MyRequestsSteps_StateOfVacationSteps extends ScenarioSteps {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	MainMenuPage homePage;
	MyRequestsPage myRequestsPage;
	StateOfVacationRequestPage stateOfVacationRequestPage;

	
	
	//verify element in page - text State Vacation Request
	@Step
	public void textStateVacationShouldBeDisplayed(boolean expected) {
		Assert.assertEquals(expected, stateOfVacationRequestPage.stateVacationRequestPresence());
	}
	   
	//verify element in page - text State Vacation Request
	@Step
	public void textVacationInfoShouldBeDisplayed(boolean expected) {
		Assert.assertEquals(expected, stateOfVacationRequestPage.vacationInfoPresence());
	}
} 
		

