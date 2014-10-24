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
public class EmailReadingTest {

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
	
	@Steps
	EmailReadingSteps emailReadingSteps;
	
	
	
	//test - email reading
	@Test
	public void myRequestsTest()
	{
		String username="irina.neagu";
		String password="irinaEvo10#";
		String sender="EvoPortal Team <evoportal@evozon.com>";
		String subj="New Vacation Request submitted by Andrei Dragomir";
		String holiday = "The user will be on holiday between";
		String startDate = "4/December/2014";
		String endDate = "18/December/2014";
		//homePageSteps.is_the_home_page();
    	//logInPageSteps.login(Constants.USERNAME, Constants.PASSWORD);
    	
    	
    	//emailReadingSteps.accesingInboxFolderFromMail(username,password); 
    	//emailReadingSteps.accesingInboxFolderLastEmail(username,password);
		//emailReadingSteps.accesingInboxFolderAllUnreadEmails(username,password);
		//emailReadingSteps.accesingUnreadEmailsFromCertainSenderWithCertainSubject(username,password,sender,subj);
		emailReadingSteps.accesingUnreadEmailsFromCertainSenderWithCertainSubjectAndCertainContent(username,password,sender,subj,holiday,startDate,endDate);
	}
}

   
