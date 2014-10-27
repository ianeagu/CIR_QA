package com.Testing_project.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import com.Testing_project.pages.HomePage;

public class HomePageSteps extends ScenarioSteps {

	private static final long serialVersionUID = 1L;

	HomePage homePage;

	//deschidem pagina
	@Step
	public void is_the_home_page() {
		homePage.open();
	}
	
	//functie (click) buton "Sign In" din "Home Page"
	@Step
	public void click_SignIn_home() {
		homePage.click_SignIn_button();
	}
	
}