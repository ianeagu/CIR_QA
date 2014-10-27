package com.Testing_project.MyRequestsTests;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.runners.ThucydidesRunner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Testing_project.steps.EmailReadingSteps;
import com.Testing_project.steps.HomePageSteps;
import com.Testing_project.steps.LogInPageSteps;
import com.Testing_project.steps.MainMenuSteps;
import com.Testing_project.steps.MyRequestsSteps;
import com.Testing_project.steps.MyRequestsSteps_StateOfVacationSteps;
import com.Testing_project.utilities.Constants;

@RunWith(ThucydidesRunner.class)
public class MyRequests_StateOfVacation_Withdraw_Email_Test {

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
	EmailReadingSteps emailReadingSteps;
	
	@Steps
	MyRequestsSteps_StateOfVacationSteps myRequestsSteps_StateOfVacationSteps;
	
	  
	//test - selectie multipla
	@Test
	public void myRequests_DaysNumberTest()
	{
		String username="irina.neagu";
		String password="Evo10#irina";
		String sender="EvoPortal Team <evoportal@evozon.com>";
		String subj="Andrei Dragomir Vacation Request Withdrawn";
		String holiday = "A Vacation Request was withdrawn";
		String startDate = "02/October/2015";
		String endDate = "09/October/2015";
		homePageSteps.is_the_home_page();
    	logInPageSteps.login(Constants.USERNAME, Constants.PASSWORD);
    	//click pe "VACATION"
    	mainMenuSteps.clickVacationTab();	
    	//click pe "My requests" - button
    	myRequestsSteps.clickMyReqButton();
    	
    	//select "Vacation Type" -> holiday
    	myRequestsSteps.selectOperationVacationType("Holiday");
    	//select "Days Number" -> 1-5 
    	myRequestsSteps.selectOperationDaysNumber("6 - 10");
    	//select "Vacation Status" -> pending
    	myRequestsSteps.selectOperationVacationStatus("Pending");
    	//apply options
    	myRequestsSteps.clickApply();
    	//click -> first element of the "Type" column
    	myRequestsSteps.clickFirstElementTypeColumn();
    	//validate page
    	myRequestsSteps_StateOfVacationSteps.textStateVacationShouldBeDisplayed(true);
    	myRequestsSteps_StateOfVacationSteps.textVacationInfoShouldBeDisplayed(true);
    	
    	//click - "Withdraw"
    	myRequestsSteps_StateOfVacationSteps.clickWithdraw();
    	
    	//verify if the email has been sent, with the proper content
    	emailReadingSteps.accesingUnreadEmailsFromCertainSenderWithCertainSubjectAndCertainContent(username,password,sender,subj,holiday,startDate,endDate);
    	
    	
    	
//    	//verify table filtering - for "Holiday"
//    	myRequestsSteps.checkVacationTypeDoesNotContain("Vacation Without Payment");
//    	myRequestsSteps.checkVacationTypeDoesNotContain("Special Vacation");
//    	myRequestsSteps.checkVacationTypeDoesNotContain("Sick Leave");
//		   	
//    	//verify table filtering - for days number->1-5
//    	myRequestsSteps.checkDaysNumberDoesNotContain(1,5);
//    	   	
//    	//verify table filtering - for "Pending"
//    	myRequestsSteps.checkVacationStatusDoesNotContain("Approved");
//    	myRequestsSteps.checkVacationStatusDoesNotContain("Rejected");
//    	myRequestsSteps.checkVacationStatusDoesNotContain("Withdrawn");
//    	myRequestsSteps.checkVacationStatusDoesNotContain("Cancelled");
    	
		
	}
}
