package com.Testing_project.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.WebElementFacade;
import net.thucydides.core.steps.ScenarioSteps;

import com.Testing_project.pages.LogInPage;
import com.Testing_project.utilities.Constants;

public class EndUserSteps extends ScenarioSteps {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	LogInPage firstPage;


	@Step
	public void is_the_home_page() {
//		firstPage.open();
		getDriver().get(Constants.URL);
		getDriver().manage().window().maximize();
		firstPage.click_SignIn_button();
		
	}

	@Step
	public void login()
	{
		firstPage.logInAs();
	}
	

}