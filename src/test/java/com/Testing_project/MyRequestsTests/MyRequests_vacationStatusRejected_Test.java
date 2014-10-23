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
public class MyRequests_vacationStatusRejected_Test {

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
	  
	//test - selectie "Days Number"=1-5 -> Apply -> tabel filtrat
	@Test
	public void myRequests_DaysNumberTest()
	{
		homePageSteps.is_the_home_page();
    	logInPageSteps.login(Constants.USERNAME, Constants.PASSWORD);
    	//click pe "VACATION"
    	mainMenuSteps.clickVacationTab();	
    	//click pe "My requests" - button
    	myRequestsSteps.clickMyReqButton();
		
		//check - >1-5
		myRequestsSteps.checkRejected();
		//click - apply
		myRequestsSteps.clickApply();
		
		//verificare filtrare conform "Holiday status" - rejection
		myRequestsSteps.checkVacationStatusDoesNotContain("Pending");
		myRequestsSteps.checkVacationStatusDoesNotContain("Cancelled");
	}
}
