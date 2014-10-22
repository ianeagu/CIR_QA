package com.Testing_project.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import com.Testing_project.pages.MainMenuPage;

public class MainMenuSteps extends ScenarioSteps {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	MainMenuPage homePage;

	@Step
	public void clickVacationTab() {
		homePage.clickVacationTab();
	}
}
