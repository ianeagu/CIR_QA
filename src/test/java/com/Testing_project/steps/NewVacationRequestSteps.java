package com.Testing_project.steps;

import java.text.ParseException;

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
	public void verifyThatYouAreOnCreateNewVacationRequestPage()
	{
		newVacationRequestPage.verifyThatYouAreOnCreateNewVacationRequestPage();
	}
	
	
	
	
	@Step
	public void selectStartDate(int month, int day, int year) throws ParseException
	{
		newVacationRequestPage.clickStartDateBox();
		newVacationRequestPage.setDate(month, day, year);
		
	}

	public void selectEndDate(int month, int day, int year) throws ParseException {
		newVacationRequestPage.clickEndDateBox();
		newVacationRequestPage.setDate(month, day, year);
		
	}
	

	@Step
	public void clickNewVacationRequestHolidayBtn()
	{
		newVacationRequestPage.clickNewVacationRequestHolidayBtn();
	}
	   
	@Step
	public void clickNewVacationRequestVacationWithoutPaymentBtn()
    {
		newVacationRequestPage.clickNewVacationRequestVacationWithoutPaymentBtn();
	}
	
	@Step
	public void clickNewVacationRequestSpecialVacationBtn()
	{
		newVacationRequestPage.clickNewVacationRequestSpecialVacationBtn();
	}
	
	@Step
	public void clickNewVacationRequestSickLeaveBtn()
	{
		newVacationRequestPage.clickNewVacationRequestSickLeaveBtn();
    }
	
	@Step
	public void clickNewVacationSaveBtn()
	{
		newVacationRequestPage.clickNewVacationSaveBtn();
	}
	
	@Step
	public void clickNewVacationBackBtn()
	{
		newVacationRequestPage.clickNewVacationBackBtn();
	}
	
	@Step
	public void verifyThatYouAreOnMyRequestsPage()
	{
	newVacationRequestPage.verifyThatYouAreOnMyRequestsPage();
		
	}

	}
	
