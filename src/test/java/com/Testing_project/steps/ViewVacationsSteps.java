package com.Testing_project.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import com.Testing_project.pages.ViewVacationsPage;

public class ViewVacationsSteps extends ScenarioSteps {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	ViewVacationsPage viewVacationsPage;

	@Step
	public void clickViewVacationsBtn()
	{
		viewVacationsPage.clickViewVacationsBtn();
		
	}
	
	
	
	@Step
	public void verifyThatYouAreOnViewVacationsPage()
	{
		viewVacationsPage.verifyThatYouAreOnViewVacationsPage();
	}
	

	@Step
	public void clickVacationType(String vacationType)
	{
		viewVacationsPage.selectVacationType(vacationType);
	}
	
	@Step
	public void clickDaysNumber(String daysNumber)
	{
		viewVacationsPage.selectDaysNumber(daysNumber);
	}
	
	@Step
	public void clickVacationStatus(String vacationStatus)
	{
		viewVacationsPage.selectVacationStatus(vacationStatus);
	}
	
	@Step
	public void clickApplyBtn()
	{
		viewVacationsPage.clickApplyBtn();
		
	}
	
	@Step
	public void verifyVacationType(String vacationType)
	{
		viewVacationsPage.verifyVacationType(vacationType);
	}
	
	@Step
	public void verifyDaysNumber(int lowerValue, int higherValue)
	{
		viewVacationsPage.verifyDaysNumber(lowerValue, higherValue);
	}
	
	@Step
	public void verifyVacationStatus(String vacationStatus)
	{
		viewVacationsPage.verifyVacationStatus(vacationStatus);
	}
	
}

	
