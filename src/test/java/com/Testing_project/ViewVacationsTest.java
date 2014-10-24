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
import com.Testing_project.steps.ViewVacationsSteps;
import com.Testing_project.utilities.Constants;


@RunWith(ThucydidesRunner.class)
public class ViewVacationsTest {

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
    
    @Steps
    ViewVacationsSteps viewVacationsSteps;
    
    @Test
    public void test_New_Req() throws ParseException
    {
    	
    	homePageSteps.is_the_home_page();
    	logInPageSteps.login("rt","@ghir3sF@brici1991");
    	homeSteps.clickVacationTab();
    	viewVacationsSteps.clickViewVacationsBtn();
    	viewVacationsSteps.verifyThatYouAreOnViewVacationsPage();
    	viewVacationsSteps.clickVacationType("holiday");
    	viewVacationsSteps.clickDaysNumber("1 - 5");
    	viewVacationsSteps.clickVacationStatus("approved");
    	viewVacationsSteps.clickViewVacationsLastName();
    	viewVacationsSteps.clickViewVacationsLastName("Dragomir");
    	viewVacationsSteps.clickViewVacationsFirstName();
    	viewVacationsSteps.clickViewVacationsFirstName("Andrei");
    	viewVacationsSteps.clickApplyBtn();
    	viewVacationsSteps.verifyVacationType("holiday");
    	viewVacationsSteps.verifyDaysNumber(1,5);
    	viewVacationsSteps.verifyVacationStatus("approved");
    	viewVacationsSteps.verifyEmployeeName("Andrei","Dragomir");
    	
    	
    	
    }
  
} 