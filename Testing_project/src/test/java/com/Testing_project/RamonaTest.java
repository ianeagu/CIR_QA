package com.Testing_project;

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

//import com.Testing_project.requirements.Application;
import com.Testing_project.steps.EndUserSteps;
import com.Testing_project.steps.NewVacationRequestSteps;
import com.Testing_project.utilities.Constants;


@RunWith(ThucydidesRunner.class)
public class RamonaTest {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @ManagedPages(defaultUrl ="http://192.168.1.68:9090/vacation")
    public Pages pages;

    @Steps
    public NewVacationRequestSteps endUser;

    @Steps
    EndUserSteps loginSteps;
    
    @Test
    public void test_New_Req()
    {
    	
    	loginSteps.is_the_home_page();
    	loginSteps.login();
    	
//    	endUser.clickNewVacationRequest();
//    	endUser.assureCreateVacationTitle();
    	
    }
  
} 