package com.Testing_project.MyRequestsTests;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.annotations.UseTestDataFrom;
import net.thucydides.junit.runners.ThucydidesParameterizedRunner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Testing_project.steps.HomePageSteps;
import com.Testing_project.steps.LogInPageSteps;
import com.Testing_project.steps.MainMenuSteps;
import com.Testing_project.steps.MyRequestsSteps;
import com.Testing_project.utilities.Constants;

@RunWith(ThucydidesParameterizedRunner.class)
@UseTestDataFrom("resources/DataForTest.csv")

public class MyRequests_DataDriven_Test {
	
	String vacationType, daysNumber, vacationStatus;

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
	  
	
	//test - Data-Driven selection for "My Requests"; filtering by "Vacation Type", "Days Number" and "Vacation Status"
	@Test
	public void myRequests_holidayTest()
	{
		homePageSteps.is_the_home_page();
    	logInPageSteps.login(Constants.USERNAME, Constants.PASSWORD);
    	//click pe "VACATION"
    	mainMenuSteps.clickVacationTab();	
    	//click pe "My requests" - button
    	myRequestsSteps.clickMyReqButton();
		
    	//selectie "Vacation Type"
    	myRequestsSteps.selectOperationVacationType(vacationType);
    	
    	//selectie "Days Number"
    	myRequestsSteps.selectOperationDaysNumber(daysNumber);
    	
    	//selectie "Vacation Status"
    	myRequestsSteps.selectOperationVacationStatus(vacationStatus);
    	
    	//click - apply
    	myRequestsSteps.clickApply();
    	
    	//verify column "Type"
    	myRequestsSteps.verifyVacationTypeColumn(vacationType);
    	
//    	//verify column "Days Number"
//    	myRequestsSteps.checkDaysNumberDoesNotContain();
    	
    	//verify column "Vacation Status"
    	myRequestsSteps.verifyVacationStatusColumn(vacationStatus);
    	
	}
}
