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

import com.Testing_project.steps.HomePageSteps;
//import com.Testing_project.requirements.Application;
import com.Testing_project.steps.LogInPageSteps;
import com.Testing_project.steps.MainMenuSteps;
import com.Testing_project.steps.NewVacationRequestSteps;
import com.Testing_project.utilities.Constants;


@RunWith(ThucydidesRunner.class)
public class RamonaTest {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @ManagedPages(defaultUrl = Constants.LOGIN_URL)
    public Pages pages;

    @Steps
    LogInPageSteps logInPageSteps;
    
    @Steps
    HomePageSteps homePageSteps;
    
    @Steps
    MainMenuSteps homeSteps;
    
    @Steps
    NewVacationRequestSteps newVacationRequestSteps;
    
    @Test
    public void test_New_Req() throws ParseException
    {
    	
    	homePageSteps.is_the_home_page();
    	logInPageSteps.login(Constants.USERNAME, Constants.PASSWORD);
    	homeSteps.clickVacationTab();
    	newVacationRequestSteps.clickNewVacationRequest();
    	newVacationRequestSteps.verifyThatYouAreOnCreateNewVacationRequestPage();
    	newVacationRequestSteps.selectStartDate(8, 19, 2014);
    	newVacationRequestSteps.selectEndDate(8, 19, 2014);
//    	newVacationRequestSteps.clickNewVacationRequestHolidayBtn();
//    	newVacationRequestSteps.clickNewVacationRequestVacationWithoutPaymentBtn();
        newVacationRequestSteps.clickNewVacationRequestSpecialVacationBtn();
    	newVacationRequestSteps.chooseChildren();
//    	newVacationRequestSteps.clickNewVacationRequestSickLeaveBtn();
//    	
    	newVacationRequestSteps.clickNewVacationRequestAddCommentBtn();
    	newVacationRequestSteps.clickNewVacationRequestCommentSpace();
    	newVacationRequestSteps.clickNewVacationRequestAddComment("I'll go in a trip");
    	newVacationRequestSteps.clickNewVacationSaveBtn();
//    	newVacationRequestSteps.clickNewVacationWithdrawBtn();
     	newVacationRequestSteps.clickNewVacationEditBtn();
//    	newVacationRequestSteps.verifyThatYourVacationWasWithdrawPage();
    	newVacationRequestSteps.verifyThatYourVacationWasEditPage();
//    	newVacationRequestSteps.verifyThatYouAreOnVacationInfoPage();
//     	newVacationRequestSteps.clickVacationInfoBackBtn();

    }
  
} 