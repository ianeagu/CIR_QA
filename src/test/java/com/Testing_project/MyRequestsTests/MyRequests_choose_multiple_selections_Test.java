package com.Testing_project.MyRequestsTests;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.runners.ThucydidesRunner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Testing_project.steps.HomePageSteps;
import com.Testing_project.steps.LogInPageSteps;
import com.Testing_project.steps.MainMenuSteps;
import com.Testing_project.steps.MyRequestsSteps;
import com.Testing_project.utilities.Constants;

@RunWith(ThucydidesRunner.class)
public class MyRequests_choose_multiple_selections_Test {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@ManagedPages(defaultUrl = Constants.LOGIN_URL)
	public Pages pages;
	
	@Steps
    HomePageSteps homePageSteps;
	
	@Steps
    LogInPageSteps logInPageSteps;
	
	@Steps
    MainMenuSteps mainMenuSteps;
	
	@Steps
    MyRequestsSteps myRequestsSteps;
	  
	//test - selectie multipla
	@Test
	public void myRequests_DaysNumberTest()
	{
		homePageSteps.is_the_home_page();
    	logInPageSteps.login(Constants.USERNAME, Constants.PASSWORD);
    	//click pe "VACATION"
    	mainMenuSteps.clickVacationTab();	
    	//click pe "My requests" - button
    	myRequestsSteps.clickMyReqButton();
    	
    	//select "Vacation Type" -> holiday
    	myRequestsSteps.selectOperationVacationType("Holiday");
    	//select "Days Number" -> 1-5 
    	myRequestsSteps.selectOperationDaysNumber("1 - 5");
    	//select "Vacation Status" -> pending
    	myRequestsSteps.selectOperationVacationStatus("Pending");
    	//apply options
    	myRequestsSteps.clickApply();
    	
    	//verify table filtering - for "Holiday"
    	myRequestsSteps.checkVacationTypeDoesNotContain("Vacation Without Payment");
    	myRequestsSteps.checkVacationTypeDoesNotContain("Special Vacation");
    	myRequestsSteps.checkVacationTypeDoesNotContain("Sick Leave");
		   	
    	//verify table filtering - for days number->1-5
    	myRequestsSteps.checkDaysNumberDoesNotContain(1,5);
    	   	
    	//verify table filtering - for "Pending"
    	myRequestsSteps.checkVacationStatusDoesNotContain("Approved");
    	myRequestsSteps.checkVacationStatusDoesNotContain("Rejected");
    	myRequestsSteps.checkVacationStatusDoesNotContain("Withdrawn");
    	myRequestsSteps.checkVacationStatusDoesNotContain("Cancelled");
    	
		
	}
}
