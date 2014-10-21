package com.Testing_project.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;

import org.junit.Assert;

import com.Testing_project.pages.LogInPage;

public class LogInPageSteps extends ScenarioSteps {

	private static final long serialVersionUID = 1L;

	LogInPage logPage;

	//metoda - accesare pagina
	@Step
	public void open_page() {
		logPage.open();
	}	
	
	@Step
	public void type_userName(String username)
	{
		logPage.type_user(username);
	}

	@Step
	public void type_userPassword(String password)
	{
		logPage.type_password(password);
	}
	
	//functie (click) buton "Sign In" din "LogIn Page"
	@Step
	public void click_SignIn_button() {
		logPage.signIn_logIn();		
	}
	
	@Step
	public void signOut_ShouldbeDisplayed(boolean expected) {
		Assert.assertEquals(expected, logPage.is_SignOut_Displayed());
	}

	@StepGroup
	public void login(String username, String password) {
		open_page();
		type_userName(username);
		type_userPassword(password);
		click_SignIn_button();
	}
		
}