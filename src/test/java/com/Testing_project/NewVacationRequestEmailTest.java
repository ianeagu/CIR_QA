package com.Testing_project;

import java.text.ParseException;

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
//import com.Testing_project.requirements.Application;
import com.Testing_project.steps.LogInPageSteps;
import com.Testing_project.steps.MainMenuSteps;
import com.Testing_project.steps.NewVacationRequestSteps;
import com.Testing_project.utilities.Constants;


@RunWith(ThucydidesRunner.class)
public class NewVacationRequestEmailTest {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @ManagedPages(defaultUrl =Constants.LOGIN_URL)
    public Pages pages;

    @Steps
    HomePageSteps homePageSteps;
    
    @Steps
    LogInPageSteps logInPageSteps;
    
    @Steps
    MainMenuSteps mainMenuSteps;
    
    @Steps
    NewVacationRequestSteps newVacationRequestSteps;
    
    @Steps
    EmailReadingSteps readingEmailSteps;

    @Steps
	EmailReadingSteps emailReadingSteps;
    
    @Test
    public void test_New_Req() throws ParseException
    {
//    	String username_1="rt";
//		String password_1="@ghir3sF@brici1991";	
		
		homePageSteps.is_the_home_page();
		//homePageSteps.click_SignIn_home();
    	logInPageSteps.login(Constants.USERNAME, Constants.PASSWORD);
    	
		mainMenuSteps.clickVacationTab();//click "Vacation" menu
	
		newVacationRequestSteps.clickNewVacationRequest();//click "New Vacation Request" menu		
		newVacationRequestSteps.selectStartDate(1,13,2015);
		newVacationRequestSteps.selectStartDate(1,14,2015);
		newVacationRequestSteps.clickNewVacationRequestHolidayBtn();
		newVacationRequestSteps.clickNewVacationSaveBtn();
		
		
		String username="ramona.toadere";//username-Zimbra
		String password="@ghir3sF@brici1991";//password-Zimbra
		String subj="New Vacation Request submitted by Andrei Dragomir";
		String holiday = "The user will be on holiday between";
		String startDate = "14/January/2015";
		String endDate = "14/January/2015";
		String sender="EvoPortal Team <evoportal@evozon.com>";
    	
		
    	
		
		emailReadingSteps.accesingUnreadEmailsFromCertainSenderWithCertainSubjectAndCertainContent(username,password,sender,subj,holiday,startDate,endDate);
	}

    }
  
