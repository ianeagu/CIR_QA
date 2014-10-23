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
import com.Testing_project.steps.MyRequestsSteps_StateOfVacationSteps;
import com.Testing_project.utilities.Constants;

@RunWith(ThucydidesRunner.class)
public class MyRequests_VacationStatus_Test {

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
	
	@Steps
	MyRequestsSteps_StateOfVacationSteps myRequestsSteps_StateOfVacationSteps;
	
	
	
	//test - intrare in "My requests" page si validare
	@Test
	public void myRequestsTest()
	{
		homePageSteps.is_the_home_page();
    	logInPageSteps.login(Constants.USERNAME, Constants.PASSWORD);
    	//click on "VACATION"
    	mainMenuSteps.clickVacationTab();	
    	//click on "My requests" - button
    	myRequestsSteps.clickMyReqButton();
    	//click on first element of "Type" column
    	myRequestsSteps.clickFirstElementTypeColumn();
    	
    	//validare pagina "State" Vacation Request
    	myRequestsSteps_StateOfVacationSteps.textStateVacationShouldBeDisplayed(true);
    	myRequestsSteps_StateOfVacationSteps.textVacationInfoShouldBeDisplayed(true);
	}
}

   
