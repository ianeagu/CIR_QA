package com.Testing_project;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.runners.ThucydidesRunner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Testing_project.steps.EndUserSteps;
import com.Testing_project.steps.HomeSteps;
import com.Testing_project.steps.VacationSteps;

@RunWith(ThucydidesRunner.class)
public class VacationTest {
	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@ManagedPages(defaultUrl = "http://192.168.1.68:9090/")
	public Pages pages;
	@Steps
	public EndUserSteps endUser;
	@Steps
	public HomeSteps homeSteps;
	@Steps
	VacationSteps vacationSteps;

	@Test
	public void test_logIn() {
		endUser.is_the_home_page();
		endUser.login();
		homeSteps.clickVacationTab();
		vacationSteps.verifyThatYouAreOnVacationPage("Vacation");
	}

	
	
}
