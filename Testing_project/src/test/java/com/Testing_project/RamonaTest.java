package com.Testing_project;

import java.text.ParseException;

import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Story;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.annotations.Managed;
import net.thucydides.junit.runners.ThucydidesRunner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Testing_project.pages.HomePage;
//import com.Testing_project.requirements.Application;
import com.Testing_project.steps.EndUserSteps;
import com.Testing_project.steps.HomeSteps;
import com.Testing_project.steps.NewVacationRequestSteps;
import com.Testing_project.utilities.Constants;


@RunWith(ThucydidesRunner.class)
public class RamonaTest {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @ManagedPages(defaultUrl ="http://192.168.1.68:9090/vacation")
    public Pages pages;

    @Steps
    EndUserSteps endUserSteps;
    
    @Steps
    EndUserSteps loginSteps;
    
    @Steps
    HomeSteps homeSteps;
    
    @Steps
    NewVacationRequestSteps newVacationRequestSteps;
    
    @Test
    public void test_New_Req() throws ParseException
    {
    	
    	loginSteps.is_the_home_page();
    	loginSteps.login();
    	homeSteps.clickVacationTab();
    	newVacationRequestSteps.clickNewVacationRequest();
    	newVacationRequestSteps.verifyThatYouAreOnCreateNewVacationRequestPage();
    	newVacationRequestSteps.selectStartDate(2, 22, 2014);
    	newVacationRequestSteps.selectEndDate(2, 22, 2014);
    	newVacationRequestSteps.clickNewVacationSickLeaveBtn();
    	newVacationRequestSteps.clickNewVacationSaveBtn();
//    	newVacationRequestSteps.clickNewVacationBackBtn();
//    	newVacationRequestSteps.verifyThatYouAreOnMyRequestsPage();
//    	
    	
    	
    	
   
    }
  
} 