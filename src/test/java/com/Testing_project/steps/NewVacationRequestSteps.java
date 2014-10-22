package com.Testing_project.steps;

import java.text.ParseException;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import com.Testing_project.pages.NewVacationRequestPage;

public class NewVacationRequestSteps extends ScenarioSteps {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
	  public void chooseChildren(){
	   newVacationRequestPage.chooseChildBirth();
	  }
	
	@Step
	public void clickNewVacationRequestSickLeaveBtn()
	{
		newVacationRequestPage.clickNewVacationRequestSickLeaveBtn();
    }
	
	@Step
	public void clickNewVacationRequestAddCommentBtn()
	{
		newVacationRequestPage.clickNewVacationRequestAddComment();
    }
	
	@Step
	public void clickNewVacationRequestCommentSpace()
	{
		newVacationRequestPage.clickNewVacationRequestCommentSpace();
    }
	
	
	@Step
	public void clickNewVacationRequestAddComment(String comment)
	{
		
		newVacationRequestPage.typeComment(comment);
    }
	
	
	
	@Step
	public void clickNewVacationSaveBtn()
	{
		newVacationRequestPage.clickNewVacationSaveBtn();
	}
	
	@Step
	public void clickNewVacationWithdrawBtn()
	{
		newVacationRequestPage.clickNewVacationWithdrawBtn();
	}
	
	@Step
	public void clickNewVacationEditBtn()
	{
		newVacationRequestPage.clickNewVacationEditBtn();
	}
	
	@Step
	public void verifyThatYourVacationWasWithdrawPage()
	{
		newVacationRequestPage.verifyThatYourVacationWasWithdrawPage();
	}
	
	@Step
	public void verifyThatYourVacationWasEditPage()
	{
		newVacationRequestPage.verifyThatYourVacationWasEditPage();
	}
	
	
	@Step
	public void verifyThatYouAreOnVacationInfoPage()
	{
		newVacationRequestPage.verifyThatYouAreOnVacationInfoPage();
	}
	
	
	
	@Step
	public void clickVacationInfoBackBtn()
	{
		newVacationRequestPage.clickVacationInfoBackBtn();
	}
	
	
	

	}
	
