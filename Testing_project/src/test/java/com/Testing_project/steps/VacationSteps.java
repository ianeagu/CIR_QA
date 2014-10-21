package com.Testing_project.steps;

import com.Testing_project.pages.MyRequestsPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class VacationSteps  extends ScenarioSteps{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
MyRequestsPage vacationPage;
	@Step
	public void verifyThatYouAreOnVacationPage(String navigationHeaderTitle){
		vacationPage.verifyThatYouAreOnVacationPage(navigationHeaderTitle);
	}

}
