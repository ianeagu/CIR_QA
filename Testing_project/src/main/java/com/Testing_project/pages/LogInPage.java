package com.Testing_project.pages;

import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;

public class LogInPage extends PageObject {

	@FindBy(css = "input[id='_58_login']")
	public WebElementFacade inputName;

	@FindBy(css = "input[id='_58_password']")
	public WebElementFacade inputPassword;

	@FindBy(css = "input[type='submit']")
	public WebElementFacade signIN_loginPage;

	// variabila pentru validarea "Sign In"
	@FindBy(css = "span[class='sign-out']")
	public WebElementFacade signout_link;

	public void signIn_logIn() {
		signIN_loginPage.click();
	}

	public void type_user(String username) {
		getDriver().manage().window().maximize();
		inputName.clear();
		inputName.sendKeys(username);
	}

	public void type_password(String password) {
		inputPassword.clear();
		inputPassword.sendKeys(password);
	}

	public boolean is_SignOut_Displayed() {
		return signout_link.isPresent();
	}
}