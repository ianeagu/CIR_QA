package com.Testing_project.steps;

import com.Testing_project.pages.NewVacationRequestPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

import static ch.lambdaj.Lambda.join;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

public class NewVacationRequestSteps extends ScenarioSteps {

    NewVacationRequestPage newVacationRequestPage;

	@Step
	public void clickNewVacationRequest()
	{
		newVacationRequestPage.clickNewVacationRequest();
		
	}
	
	@Step
	public void assureCreateVacationTitle()
	{
		newVacationRequestPage.verifyThatYouAreOnCreateNewVacationRequestPage();
	}
	}
	
