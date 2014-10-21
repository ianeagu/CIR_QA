package com.Testing_project;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.runners.ThucydidesRunner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Testing_project.steps.HomePageSteps;
import com.Testing_project.steps.LogInPageSteps;
import com.Testing_project.utilities.Constants;

@RunWith(ThucydidesRunner.class)
public class LogInTest {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@ManagedPages(defaultUrl = Constants.HOME_URL)
	public Pages pages;

	@Steps
	public HomePageSteps homeUser;

	@Steps
	public LogInPageSteps logInUser;

	// teste pentru "Home Page" - accesare pagina si click pe buton de "Sign In"
	@Test
	public void test_Home() {
		homeUser.is_the_home_page();
		homeUser.click_SignIn_home();
	}

	// teste pentru "LogInPage" - accesare pagina
	@Test
	public void test_logIn() {
		logInUser.type_userName(Constants.USERNAME);
		logInUser.type_userPassword(Constants.PASSWORD);
		logInUser.click_SignIn_button();
		logInUser.signOut_ShouldbeDisplayed(true);

	}

	// teste pentru "LogInPage" - testare negativa
	@Test
	public void test_logIn_neg() {
		logInUser.type_userName("cevacenuexista");
		logInUser.type_userPassword("parolainvalida");
		logInUser.click_SignIn_button();
		logInUser.signOut_ShouldbeDisplayed(false);
	}

}