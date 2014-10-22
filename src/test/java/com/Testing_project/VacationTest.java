package com.Testing_project;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.runners.ThucydidesRunner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Testing_project.steps.LogInPageSteps;
import com.Testing_project.steps.MainMenuSteps;
import com.Testing_project.steps.VacationSteps;
import com.Testing_project.utilities.Constants;

@RunWith(ThucydidesRunner.class)
public class VacationTest {
	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@ManagedPages(defaultUrl = Constants.LOGIN_URL)
	public Pages pages;
	
	@Steps
	public LogInPageSteps logInPageSteps;
	
	@Steps
	public MainMenuSteps homeSteps;
	
	@Steps
	VacationSteps vacationSteps;

	@Test
	public void test_logIn() {
		logInPageSteps.login(Constants.USERNAME, Constants.PASSWORD);
		homeSteps.clickVacationTab();
		//vacationSteps.verifyThatYouAreOnVacationPage("Vacation");
	}

	
	
}
