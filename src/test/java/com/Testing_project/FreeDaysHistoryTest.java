package com.Testing_project;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.runners.ThucydidesRunner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Testing_project.steps.FreeDaysHistorySteps;
import com.Testing_project.steps.HomePageSteps;
import com.Testing_project.steps.LogInPageSteps;
import com.Testing_project.steps.MainMenuSteps;
import com.Testing_project.utilities.Constants;

@RunWith(ThucydidesRunner.class)
public class FreeDaysHistoryTest {

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
	FreeDaysHistorySteps freeDaysHistorySteps;

	@Test
	public void freeDaysHistory() {

		homePageSteps.is_the_home_page();
		logInPageSteps.login(Constants.USERNAME, Constants.PASSWORD);
		homeSteps.clickVacationTab();
		freeDaysHistorySteps.clickFreeDaysHistory();
		freeDaysHistorySteps.selectVacationDaysType();
		freeDaysHistorySteps.selectOneToFiveDaysNumber();
		freeDaysHistorySteps.selectAddedDaysOperation();
		freeDaysHistorySteps.clickApplyBtn();
		freeDaysHistorySteps.checkTypeDoesNotContain("Extra Days");
		freeDaysHistorySteps.checkOperationDoesNotContain("Removed");
		freeDaysHistorySteps.checkDaysNotContain(2,5);
	}

}
