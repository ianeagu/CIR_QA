package com.Testing_project.steps;

import com.Testing_project.pages.HomePage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class HomeSteps extends ScenarioSteps {
	HomePage homePage;

	@Step
	public void clickVacationTab() {
		homePage.clickVacationTab();
	}
}
