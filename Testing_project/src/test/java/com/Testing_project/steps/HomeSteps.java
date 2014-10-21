package com.Testing_project.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import com.Testing_project.pages.HomePage;

public class HomeSteps extends ScenarioSteps {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	HomePage homePage;

	@Step
	public void clickVacationTab() {
		homePage.clickVacationTab();
	}
}
